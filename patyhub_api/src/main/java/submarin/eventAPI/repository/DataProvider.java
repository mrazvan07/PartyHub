package submarin.eventAPI.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import submarin.eventAPI.model.AppEvent;
import submarin.eventAPI.model.AppLocation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DataProvider {

    @Bean
    CommandLineRunner commandLineRunner(
            final EventRepository eventRepository,
            final LocationRepository locationRepository
    ) {
        return args -> {
            addEvent(eventRepository,
                    "The Dark Show",
                    "After Eight",
                    LocalDateTime.of(2023,1,30,21,0),
                    "Se anunță un super party! Evenimentele organizate de After Eight sunt de neuitat!",
                    "Vineri, Dj Dark va scoate partea întunecată din noi, la suprafață. Get ready, this guy is about to blow ya minds! 😍\n" +
                            "El e gata să transforme trupurile în valuri de vibrații halucinante, voi veniți cu vibe-ul bun de acasă, dacă nu, vă ajutăm noi 🤪",
                    20,
                    "http://localhost:3000/"+"images/img0.png"
            );
            addEvent(eventRepository,
                    "World of NOA",
                    "After Eight",
                    LocalDateTime.of(2023,2,2,20,0),
                    "Se anunță un super party! Evenimentele organizate de Club NOA sunt de neuitat!",
                    "Are you ready to light another memorable night?\n" +
                            "Let the warmth of our party take the chill from the air!\n" +
                            "Guest DJ – Stan Adrian\n",
                    30,
                    "http://localhost:3000/"+"images/img1.png"
            );
            addEvent(eventRepository,
                    "Petrecerea bratarilor",
                    "After Eight",
                    LocalDateTime.of(2023,1,25,22,0),
                    "Se anunță un super party! Evenimentele organizate de After Eight sunt de neuitat!",
                    "Pregătiți-vă de o noapte plină de dans, de nebunie curată și, așa cum v-am obișnuit,\n+" +
                            "brățări - neon care vă transmit statusul: SINGLE | TAKEN | COMPLICATED\n",
                    40,
                    "http://localhost:3000/"+"images/img5.jpg");
            addEvent(eventRepository,
                    "HALL STARS",
                    "Euphoria",
                    LocalDateTime.of(2023,2,2,20,0),
                    "Se anunță un super party! Evenimentele organizate de Club After Eight sunt de neuitat!",
                    "See you on the dance floor la (H)ALL STARS NIGHT 😎!\n" +
                            "Hai cu hainele alea cele mai flashy să ne aducem un pic aminte de vibe-ul de festival 🥳.\n",
                    40,
                    "http://localhost:3000/"+"images/img2.png"
            );
            addEvent(eventRepository,
                    "Retro Fever Night",
                    "Euphoria",
                    LocalDateTime.of(2023,1,27,22,0),
                    "Se anunță un super party! Evenimentele organizate de Club Euphoria sunt de neuitat!",
                    "Hips don't lie la Retro Night Fever \n" +
                            "Atmosfera o să fie întreținută de Mc Dylma și Pappa M\n",
                    25,
                    "http://localhost:3000/"+"images/img6.jpg");
            addEvent(eventRepository,
                    "ZU Party",
                    "Euphoria",
                    LocalDateTime.of(2023,1,28,21,0),
                    "Se anunță un super party! Evenimentele organizate de Club Euphoria sunt de neuitat!",
                    "Adi Mihăilă-The Hitman și DJ Energy K o să stea la \n" +
                            " și o să-ți aducă atmosfera aia mișto de care ai nevoie",
                    35,
                    "http://localhost:3000/"+"images/img7.jpg");
            addEvent(eventRepository,
                    "Retro Revolution 2000's",
                    "Revolution",
                    LocalDateTime.of(2023,2,2,20,0),
                    "Se anunță un super party! Evenimentele organizate de Revolution Club sunt de neuitat!",
                    "Are you ready to light another memorable night?\n" +
                            "Let the warmth of our party take the chill from the air!\n" +
                            "Guest DJ – Stan Adrian\n",
                    50,
                    "http://localhost:3000/"+"images/img3.png"
            );
            addEvent(eventRepository,
                    "Armonia – Disco&Retro",
                    "Revolution",
                    LocalDateTime.of(2023,2,2,20,0),
                    "Se anunță un super party! Evenimentele organizate de Revolution Club sunt de neuitat!",
                    "If it’s NOA – it’s something special: Retro & Disco Party!\n" +
                            "Let’s take a walk down memory lane and have fun with our loved ones, all while enjoying the retro vibes.\n",
                    40,
                    "http://localhost:3000/"+"images/img4.png"
            );
            addEvent(eventRepository,
                    "Blackout Party",
                    "Revolution",
                    LocalDateTime.of(2023,2,14,22,0),
                    "Se anunță un super party! Evenimentele organizate de Revolution Club sunt de neuitat!",
                    "Get ready for Blackout Party Free entry for girls Best offers\n" +
                            "Joi pregătim un party cu distractie la maximum, cu hituri actuale si desigur, cele mai tari oferte din oras!",
                    10,
                    "http://localhost:3000/"+"images/img8.jpg");

            addEvent(eventRepository,
                    "Shortparis",
                    "Form",
                    LocalDateTime.of(2023,1,22,21,0),
                    "Se anunță un super party! Evenimentele organizate de Form sunt de neuitat!",
                    "Shortparis performs songs in Russian, French, and English. According to John Doran of The Quietus,\n" +
                            "Shortparis is following in Sergey Kuryokhin's legacy of provocative performance art; ",
                    20,
                    "http://localhost:3000/"+"images/img9.jpg");

            addEvent(eventRepository,
                    "Bad and Boujee",
                    "Form",
                    LocalDateTime.of(2023,1,20,23,0),
                    "Se anunță un super party! Evenimentele organizate de Form sunt de neuitat!",
                    "The most beloved Trap and Hip-Hop at the same party?\n" +
                            "Exactly! Bad and Boujee will bring you the most epic night of this concept for this year.",
                    32,
                    "http://localhost:3000/"+"images/img10.jpg");

            addEvent(eventRepository,
                    "Girls can Drink Free Flow Party",
                    "Form",
                    LocalDateTime.of(2023,1,18,20,0),
                    "Se anunță un super party! Evenimentele organizate de Form sunt de neuitat!",
                    "Your favourite club comes to all our favourite ladies with an all-new favourite offer,\n" +
                            " for the first time ever:",
                    25,
                    "http://localhost:3000/"+"images/img11.jpg");

            addEvent(eventRepository,
                    "World of Noa",
                    "NOA",
                    LocalDateTime.of(2023,1,25,22,0),
                    "Se anunță un super party! Evenimentele organizate de Club NOA sunt de neuitat!",
                    "Are you ready to light another memorable night?\n" +
                            "Let the warmth of our party take the chill from the air!\n" +
                            "Guest DJ – Stan Adrian\n",
                    30,
                    "http://localhost:3000/"+"images/img12.jpg");

            addEvent(eventRepository,
                    "Christmas Party",
                    "NOA",
                    LocalDateTime.of(2022,12,25,21,0),
                    "Se anunță un super party! Evenimentele organizate de Club NOA sunt de neuitat!",
                    "Distreza-te alaturi de Grasu XXL si de hit-urile copilariei tale!",
                    15,
                    "http://localhost:3000/"+"images/img13.jpg");
            addEvent(eventRepository,
                    "URBN Party",
                    "NOA",
                    LocalDateTime.of(2022,11,14,20,0),
                    "Se anunță un super party! Evenimentele organizate de Club NOA sunt de neuitat!",
                    "Invitat special Ace Jammal ce va innebuni publicul prin melodiile pe care le va pune",
                    24,
                    "http://localhost:3000/"+"images/img14.jpg"
            );
            addEvent(eventRepository,
                    "Latino Night",
                    "Diamond",
                    LocalDateTime.of(2023,1,20,21,0),
                    "Se anunță un super party! Evenimentele organizate de Club Diamond sunt de neuitat!",
                    "Live Band si Shot gratis si intrare libera pentru fete pana la ora 12.00.",
                    15,
                    "http://localhost:3000/"+"images/img15.jpg");

            addEvent(eventRepository,
                    "Students Christmas Night",
                    "Diamond",
                    LocalDateTime.of(2022,12,25,21,0),
                    "Se anunță un super party! Evenimentele organizate de Club Diamond sunt de neuitat!",
                    "Vino sa te distrezi alaturi de cei mai buni prieteni si colegi intr-o petrecere de sarbatoare\n"
                    +" ce se anunta incendiar",
                    15,
                    "http://localhost:3000/"+"images/img16.jpg");
            addEvent(eventRepository,
                    "Tequila Night",
                    "Diamond",
                    LocalDateTime.of(2022,12,10,22,0),
                    "Se anunță un super party! Evenimentele organizate de Club Diamond sunt de neuitat!",
                    "Tequila Night  cu shoturi de Tequila din partea casei toata seara️\n" +
                            "Muzica latino, ragae ton si balcanica spre dimineata , doar sa vii cu bateriile incarcate sa poti dansa toata noaptea️",
                    25,
                    "http://localhost:3000/"+"images/img17.jpg");


            addLocation(locationRepository,
                    "After Eight",
                    "Strada Brassai Sámuel 12",
                    "În After Eight nu ai cum să te plictisești, pentru că muzica nu îți dă voie să stai pe loc. Ești așteptat cu cele mai variate cocktailuri, " +
                            "cu sau fără alcool, fete frumoase, băieți arătoși, muzică dinamică.",
                    46.77270901598864,
                    23.59344280496493
            );
            addLocation(locationRepository,
                    "NOA",
                    "Str. Republicii 109 ",
                    "Club NOA- Nest Of Angels- este locul unde un stil unic de lux se intalneste cu cel mai bun sistem de sunet si lumini," +
                            " creand cel mai tare loc din Transilvania.",
                    46.756854022306904,
                    23.594425499560128
            );
            addLocation(locationRepository,
                    "Form",
                    "Aleea Stadionului 2",
                    "/FORM SPACE is a space of expression for artists and inspiration for the public.\n" +
                            "A home for all night animals in search of the legendary.",
                    46.76750153792799,
                    23.572519065270573
            );
            addLocation(locationRepository,
                    "Euphoria",
                    "Calea Mănăștur nr. 2-6",
                    "Ne știți deja, suntem Euphoria Music Hall, împătimiți ai petrecerilor legendare și asta știm să facem noi cel mai bine! " +
                            "Suntem unul dintre cele mai cunoscute cluburi din Cluj-Napoca. ",
                    46.76309348055628,
                    23.571276963660893
            );
            addLocation(locationRepository,
                    "Revolution",
                    "Str Memorandumului 13",
                    "Revolution Club Cluj este locul în care te simți revoluționar, în compania muzicii bune și a atmosferei incendiare!\n" +
                    "Revolution te așteaptă în inima Clujului cu party-uri memorabile și distracție garantată. " ,
                    46.76971964809061,
                    23.587190778018684
            );
            addLocation(locationRepository,
                    "Diamond",
                    "Str Republicii 110",
                    "Club Diamond - clubul detinut de Anda Adam cea smechera va asteapta seara de seara cu muzica extraordinara\n"+
                    "Life is about moments. Create them. Don’t wait for them.",
                    46.76971964809061,
                    23.587190778018684);


        };
    }

    void addEvent(EventRepository eventRepository, String name, String location, LocalDateTime date, String shortDescription, String description, Integer price, String image) {
        AppEvent appEvent;
        appEvent = AppEvent
                .builder()
                .name(name)
                .location(location)
                .date(date)
                .shortDescription(shortDescription)
                .description(description)
                .image(image)
                .ticketPrice(price)
                .build();

        eventRepository.save(appEvent);
    }

    void addLocation(LocationRepository locationRepository, String name, String address, String description, Double lat, Double lon) {
        final AppLocation appLocation = AppLocation
                .builder()
                .name(name)
                .address(address)
                .description(description)
                .lat(lat)
                .lon(lon)
                .build();

        locationRepository.save(appLocation);
    }
}
