[h3]Co to jest $Projectname?[/h3]
$Projectname to bezpłatny i otwartoźródłowy zestaw aplikacji i usług internetowych działających na specjalnym serwerze internetowym, zwanym "hubem", który może łączyć się z innymi hubami w sfederalizowanej sieci internetowej.
$Projectname zapewnia użytkownikom zaawansowaną komunikację, tożsamości i usług kontroli dostępu, które bezproblemowo współpracują w różnych domenach i niezależnych witrynach internetowych. Pozwala użytkownikom [b]publicznie[/b] lub [b]prywatnie[/b] publikować treści za pośrednictwem "kanałów" (ang. channel), które są podstawowymi, zabezpieczonymi kryptograficznie tożsamościami zapewniającymi uwierzytelnianie niezależnie od hubów, które je hostują. To rewolucyjne wyzwolenie tożsamości online z poszczególnych serwerów i domen jest nazywane "tożsamością nomadyczną" i jest oparte na protokole Zot, nowej strukturze zdecentralizowanej kontroli dostępu ze szczegółowymi, rozszerzalnymi uprawnieniami.
Z praktycznego punktu widzenia członków danego huba, korzystających z oprogramowania $Projectname, oferuje ono szereg znanych, zintegrowanych aplikacji i usług internetowych, w tym:
[ul]
[li]wątki dyskusyjne w sieciach społecznościowych[/li]
[li]przechowywanie plików w chmurze[/li]
[li]kalendarz i kontakty (z obsługą CalDAV i CardDAV)[/li]
[li]hosting stron internetowych z systemem zarządzania treścią[/li]
[li]wiki[/li]
[li]i dużo więcej ...[/li][/ul]
Chociaż wszystkie te aplikacje i usługi można znaleźć w innych pakietach oprogramowania, tylko $Projectname pozwala ustawić uprawnienia dla grup i osób, [b]które mogą nawet nie mieć kont na Twoim hubie[/b]! W typowych aplikacjach internetowych, jeśli chcesz udostępniać rzeczy prywatnie w Internecie, osoby, którym udostępniasz dane, muszą mieć konta na serwerze, na którym znajdują się Twoje dane; w przeciwnym razie serwer nie może uwierzytelniać odwiedzających witrynę, aby wiedzieć, czy przyznać im dostęp. $Projectname rozwiązuje ten problem za pomocą zaawansowanego systemu zdalnego uwierzytelniania, który weryfikuje tożsamość odwiedzających, wykorzystując techniki obejmujące kryptografię klucza publicznego.
Dzięki oferowanym aplikacjom, $Projectname świetnie się nadaje do budowy platformy komunikacyjno-publikacyjnej o charkterze społecznościowym dla realnych grup społecznych, takich jak rodziny, lokalne grupy, organizacje społeczne, środowiska szkolne, wspólnoty mieszkańców czy wspólnoty religijne. 
 
[h3]Stos programów[/h3]
Pakiet oprogramowania $Projectname jest stosunkowo standardową aplikacją serwerową napisaną głównie w PHP i MySQL i [url=https://framagit.org/$Projectname/core/blob/master/install/INSTALL.txt]wymagającą niewiele więcej niż serwera WWW, bazy danych zgodnej z MySQL i języka skryptowego PHP[/url]. System został zaprojektowany tak, aby był łatwy do zainstalowania przez osoby z podstawowymi umiejętnościami administrowania witryną, na typowych platformach współdzielonego hostingu, z uwzglednieniem szerokiej gamy sprzętu komputerowego. Można go również łatwo rozszerzyć za pomocą wtyczek i motywów oraz innych narzędzi innych firm.

[h3]Słownik[/h3]
[dl terms="b"]
[*= hub ([i]ang. hub[/i])] Instancja tego oprogramowania działająca na standardowym serwerze WWW

[*= siatka, grid ([i]w oryginale ang., grid[/i])] Globalna sieć hubów, które wymieniają między sobą informacje za pomocą protokołu Zot. Nie są to tylko huby oparte na $Projectname, ale wszystkie hubyy implementujace protokół Zot.

[*= kanał ([i]ang. channel[/i])] Techniczny odpowiednik tożsamości. Kanał może reprezentować osobę, blog lub forum, żeby wymienić tylko kilka. Kanały mogą łączyć się z innymi kanałami w celu udostępniania informacji z bardzo szczegółowymi uprawnieniami.

[*= klon ([i]ang. clone[/i])] Kanały mogą mieć klony powiązane z oddzielnymi i niepowiązanymi kontami w niezależnych hubach. Komunikacja współdzielona z kanałem jest synchronizowana między klonami kanału, co umożliwia kanałowi wysyłanie i odbieranie wiadomości oraz dostęp do współdzielonych treści z wielu hubów. Zapewnia to odporność na awarie sieci i sprzętu, które mogą stanowić poważny problem w przypadku serwerów WWW z własnym hostingiem lub o ograniczonych zasobach. Klonowanie umożliwia całkowite przeniesienie kanału z jednego huba do drugiego, zabierając ze sobą dane i połączenia. Zobacz "tożsamość nomadyczna".

[*= tożsamość nomadyczna ([i]ang. nomadic identity[/i])] Możliwość uwierzytelniania i łatwej migracji tożsamości w niezależnych hubach i domenach internetowych. Tożsamość nomadyczna zapewnia prawdziwą własność tożsamości online, ponieważ tożsamości kanałów kontrolowanych przez konto w hubie nie są powiązane z samym hubem. hub bardziej przypomina "hosta" kanałów. W serwisie $Projectname nie masz "konta" na serwerze, tak jak na typowych serwisach internetowych - posiadasz tożsamość, którą możesz przenosić ze sobą po całej siatce za pomocą klonów. 

[*= [url=[baseurl]/help/developer/zot_protocol]Protokół Zot[/url]] Nowy protokół, oparty na JSON, do wdrażania bezpiecznej, zdecentralizowanej komunikacji i usług. Różni się od wielu innych protokołów komunikacyjnych, budując komunikację na podstawie zdecentralizowanej struktury tożsamości i uwierzytelniania. Składnik uwierzytelniania jest koncepcyjnie podobny do OpenID, ale jest odizolowany od tożsamości opartej na DNS. Tam, gdzie to możliwe, zdalne uwierzytelnianie jest ciche i niewidoczne. Zapewnia to mechanizm kontroli dostępu rozproszonego na skalę sieci WWW, który jest dyskretny.
[/dl]

[h3]Możliwości[/h3]
Ten rozdział zawiera listę niektórych podstawowych funkcjonalności platformy $Projectname, które są dołączone do oficjalnej wersji. $Projectname to platforma o dużych możliwościach rozbudowy, więc więcej funkcji i możliwości można dodać za pomocą dodatkowych motywów i wtyczek.

[h4]Suwak zaprzyjaźnienia (Affinity Slider)[/h4]
Dodając połączenia w serwisie $Projectname, członkowie mają możliwość przypisania poziomów "zaprzyjażnienia" ([i]ang. affinity[/i]), czyli określenia, jak bliska jest twoja przyjaźń z osobą reprezentowaną przez nowe połączenia. Na przykład, dodając osobę, której blog obserwujesz, możesz przypisać jej kanałowi poziom zaprzyjaźnienia "Znajomi". 

Z drugiej strony, dodając kanał przyjaciela, możesz go umieścić na poziomie zaprzyjaźnienia "Przyjaciele".

Gdy to zrobisz, narzędzie "Suwak zaprzyjaźnienia", które zwykle pojawia się u góry głównej strony kanału (matrycy), dostosowuje zawartość strony tak, aby zawierała elementy z żądanego zakresu zaprzyjaźnienia. Kanały spoza tego zakresu nie będą wyświetlane, chyba że dostosujesz suwak, aby to uwzględnić.

Suwak zaprzyjażnienia umożliwia natychmiastowe filtrowanie dużych ilości treści, pogrupowanych według poziomów zaprzyjaźnienia.

[h4]Filtrowanie połączeń (Connection Filtering)[/h4]
Masz możliwość precyzyjnego kontrolowania tego, co pojawia się w Twoim strumieniu za pomocą opcjonalnego "Filtra połączeń" ([i]ang. Connection Filter[/i]). Po włączeniu Edytor połączeń zapewnia dane wejściowe do wybierania kryteriów, które należy dopasować, aby uwzględnić lub wykluczyć określony post z określonego kanału. Gdy post został dopuszczony, wszystkie komentarze do tego posta są dozwolone, niezależnie od tego, czy spełniają kryteria wyboru. Możesz wybrać słowa, które jeśli są obecne, blokują post lub zapewniają, że zostanie uwzględniony w Twoim strumieniu. Wyrażenia regularne mogą być używane do jeszcze dokładniejszej kontroli, a także hasztagów, a nawet wykrytego języka postu.  

[h4]Listy kontrolne dostępu (Access Control Lists - ACL)[/h4]
Udostępniając zawartość, członkowie mają możliwość ograniczenia tego, kto widzi zawartość. Klikając na kłódkę pod polem udostępniania, można wybrać odbiorców postu, klikając ich nazwy.

Po wysłaniu, wiadomość będzie widoczna tylko dla nadawcy i wybranych odbiorców. Innymi słowami, wiadomość nie pojawi się na jakichkolwiek publicznych ścianach.

Listy kontroli dostępu mogą być stosowane do treści i postów, zdjęć, wydarzeń, stron internetowych, pokojów rozmów i plików. 

[h4]Jednokrotne uwierzytelnianie (Single Sign-on)[/h4]
Listy kontroli dostępu działają dla wszystkich kanałów w siatce dzięki naszej unikalnej technologii pojedynczego logowania. Większość linków wewnętrznych zapewnia token tożsamości, który można zweryfikować w innych witrynach $Projectname i wykorzystać do kontrolowania dostępu do prywatnych zasobów. Logujesz się raz do swojego centrum domowego. Następnie uwierzytelnianie we wszystkich zasobach serwisu $Projectname jest "magiczne".

[h4]Magazyn plików z obsługą WebDAV[/h4]
Pliki można przesyłać do osobistego obszaru przechowywania za pomocą narzędzi systemu operacyjnego (w większości przypadków metodą przeciągnij i upuść). Możesz chronić te pliki za pomocą list kontroli dostępu dla dowolnej kombinacji członków Hubzilli (w tym niektórych członków sieci stron trzecich) lub upublicznić je.

[h4]Albumy fotograficzne[/h4]
Przechowuj zdjęcia w albumach. Wszystkie Twoje zdjęcia mogą być chronione listami kontroli dostępu.

[h4]Kalendarze zdarzeń[/h4]
Twórz zdarzenia i zadania oraz zarządzaj nimi, które mogą być również chronione za pomocą list kontroli dostępu. Wydarzenia można importować i eksportować do innego oprogramowania przy użyciu standardowego formatu vcalendar lub iCal i udostępniać w postach innym osobom. Wydarzenia urodzinowe są automatycznie dodawane od znajomych i konwertowane na właściwą strefę czasową, dzięki czemu będziesz dokładnie wiedzieć, kiedy mają miejsce urodziny - bez względu na to, gdzie się znajdujesz na świecie w stosunku do osoby urodzonej w dniu urodzin. Wydarzenia są zwykle tworzone za pomocą liczników obecności, dzięki czemu Twoi znajomi i kontakty mogą natychmiast [url=https://pl.wikipedia.org/wiki/RSVP_(skr%C3%B3towiec]RSVP[/url].

[h4]Czaty[/h4]
Możesz utworzyć dowolną liczbę osobistych czatów i zezwolić na dostęp za pośrednictwem list kontroli dostępu. Są one zazwyczaj bezpieczniejsze niż XMPP, IRC i inne rodzaje przesyłania wiadomości błyskawicznych, chociaż zezwalamy również na korzystanie z tych innych usług za pośrednictwem wtyczek.       

[h4]Tworzenie stron internetowych[/h4]
$Projectname ma wiele narzędzi do tworzenia stron internetowych systemu CMS, w tym do edycji układu, menu, bloków, widżetów i regionów strony i treści. Dostęp do wszystkich tych elementów można kontrolować, tak aby powstałe strony były prywatne dla zamierzonych odbiorców. 

[h4]Aplikacje[/h4]
Aplikacje mogą być tworzone i rozpowszechniane przez członków. Różnią się one od tradycyjnych aplikacji typu "vendor lockin", ponieważ są całkowicie kontrolowane przez autora - który może zapewnić kontrolę dostępu do stron aplikacji docelowej i odpowiednio pobierać opłaty za ten dostęp. Większość aplikacji w Hubzilli jest bezpłatna i mogą być łatwo tworzone przez osoby bez umiejętności programowania. 

[h4]Układ stron (Layout)[/h4]
Układ strony jest oparty na języku opisu o nazwie Comanche. $Projectname sama jest napisana w układach Comanche, które możesz zmieniać. Pozwala to na poziom dostosowania, którego zwykle nie znajdziesz w tak zwanych "środowiskach wielu użytkowników".

[h4]Zakładki (Bookmarks)[/h4]
Udostępniaj i zapisuj albo zarządzaj zakładkami z linków podanych na czacie.    
 
[h4]Szyfrowanie wiadomości prywatnych i kwestie prywatności[/h4]
Prywatna poczta jest przechowywana w ukrytym formacie. Chociaż nie jest to "kuloodporne", zwykle zapobiega przypadkowemu podsłuchiwaniu przez administratora witryny lub usługodawcę internetowego.  

Każdy kanał serwisu $Projectname ma swój własny unikalny zestaw prywatnych i powiązanych publicznych kluczy RSA 4096-bitowych, generowanych podczas pierwszego tworzenia kanałów. Służy do ochrony przesyłanych prywatnych wiadomości i postów.

Ponadto wiadomości mogą być tworzone przy użyciu "szyfrowania end-to-end", którego nie mogą odczytać operatorzy serwisów $Projectname, dostawcy usług internetowych ani nikt, kto nie zna hasła. 

Wiadomości publiczne na ogół nie są szyfrowane podczas przesyłania ani przechowywania.  

Prywatne wiadomości mogą zostać wycofane po wysłaniu, chociaż nie ma gwarancji, że odbiorca ich jeszcze nie przeczytał.

Posty i wiadomości mogą być tworzone z datą wygaśnięcia, po którym zostaną usunięte lub usunięte ze strony odbiorcy.  

[h4]Federalizacja usług (Service Federation)[/h4]
Oprócz dodatkowych "łączników cross-post" do różnych alternatywnych sieci, istnieje natywna obsługa importu treści z kanałów RSS i Atom i wykorzystywania jej do tworzenia specjalnych kanałów. Dostępne są również wtyczki do komunikacji z innymi sieciami za pomocą protokołów Diaspora i GNU-Social (OStatus). Sieci te nie obsługują tożsamości nomadycznej ani kontroli dostępu między domenami. Jednak podstawowa komunikacja jest obsługiwana: do i z Diaspora, Friendica, GNU-Social, Mastodon i innych dostawców, którzy używają tych protokołów.   

Istnieje również eksperymentalna obsługa uwierzytelniania OpenID, której można używać na listach kontroli dostępu. To jest jeszcze w trakcie tworzenia, ale poeksperymentować można. Twój hub $Projectname może być używany jako dostawca OpenID do uwierzytelniania członków w zewnętrznych usługach korzystających z tej technologii. 

Kanały mogą mieć uprawnienia, aby stać się "kanałami pochodnymi", w przypadku gdy dwa lub więcej istniejących kanałów łączy się, tworząc nowy kanał tematyczny. 

[h4]Grupy prywatności (Privacy Group)[/h4]
Nasza implementacja grup prywatności jest podobna do "kręgów" w Google i "aspektów" w Diasporze. Pozwala to na filtrowanie przychodzącego strumienia według wybranych grup i automatyczne ustawianie wychodzącej listy kontroli dostępu tylko na te z tej grupy prywatności podczas publikowania. Możesz to zmienić w dowolnym momencie (przed wysłaniem postu).  


[h4]Usługi katalogowe (Directory Services)[/h4]
Zapewniamy łatwy dostęp do katalogu członków i udostępniamy zdecentralizowane narzędzia, które mogą dostarczać "sugestie" znajomych. Katalogi to zwykłe serwisy $Projectname, które zdecydowały się zaakceptować rolę serwera katalogowego. Wymaga to więcej zasobów niż większość typowych serwisów, więc nie jest to ustawienie domyślne. Katalogi są synchronizowane i dublowane, dzięki czemu wszystkie zawierają aktualne informacje o całej sieci (z zastrzeżeniem normalnych opóźnień propagacji).  

[h4]TLS/SSL[/h4]
W przypadku hubów $Projectname, które używają TLS/SSL, komunikacja między klientem a serwerem jest szyfrowana za pomocą protokołu TLS/SSL. Biorąc pod uwagę niedawno ujawnione w mediach fakty dotyczące powszechnego, globalnego nadzoru i obchodzenia szyfrowania przez NSA i GCHQ, uzasadnione jest założenie, że komunikacja chroniona przez HTTPS może być zagrożona na różne sposoby. W konsekwencji prywatna komunikacja jest szyfrowana na wyższym poziomie przed wysłaniem na zewnątrz.

[h4]Konfiguracja kanałów[/h4]
Podczas tworzenia kanału wybierana jest rola, która stosuje szereg wstępnie skonfigurowanych ustawień zabezpieczeń i prywatności. Są one wybierane z uwzględnieniem najlepszych praktyk, aby zachować prywatność na żądanym poziomie.  

W przypadku wybrania "własnej" roli prywatności każdy kanał umożliwia precyzyjne ustawienie uprawnień dla różnych aspektów komunikacji. Na przykład, pod nagłówkiem "Ustawienia bezpieczeństwa i prywatności", każdy aspekt w lewej części strony ma sześć (6) możliwych opcji przeglądania i dostępu, które można wybrać, klikając menu rozwijane. Istnieje również wiele innych ustawień prywatności, które możesz edytować. Dostępne opcje:  

 - Nikt oprócz ciebie.
 - Tylko ci, którym wyraźnie zezwalasz.
 - Ktoś w twojej książce adresowej.
 - Każdy na tej stronie.
 - Każdy w tej sieci.
 - Każdy jest uwierzytelniony.
 - Każdy w internecie.


[h4]Prywatne i publiczne fora[/h4]
Fora to zazwyczaj kanały, w których może uczestniczyć wielu autorów. Obecnie istnieją dwa mechanizmy publikowania postów na forach:

 - posty "wall-to-wall" i
 - mechanizm tagów forowych @mention.

Fora mogą być tworzone przez każdego i używane w dowolnym celu. Katalog zawiera opcję wyszukiwania forów publicznych. Fora prywatne mogą być publikowane tylko dla członków i często tylko przez nich widoczne.

[h4]Klonowanie kont[/h4]
Konta platformy $Projectname nazywane są *tożsamościami nomadycznymi*, ponieważ tożsamość członka nie jest powiązana z hubem, w którym tożsamość została pierwotnie utworzona. Na przykład, kiedy tworzysz konto na Facebooku lub Gmailu, jest ono powiązane z tymi usługami - mie może działać poza Facebook.com czy Gmail.com.  

Z drugiej strony załóżmy, że utworzyłeś tożsamość $Projectname o nazwie [code]tina@$Projectnamehub.com[/code]. Możesz sklonować ją do innego huba $Projectname, wybierając tę ​​samą lub inną nazwę, np. [code]liveForever@Some$ProjectnameHub.info[/code].

Oba kanały są teraz zsynchronizowane, co oznacza, że ​​wszystkie Twoje kontakty i preferencje zostaną zduplikowane na klonie. Nie ma znaczenia, czy wyślesz post z pierwotnego centrum, czy z nowego. Posty będą dublowane na obu kontach.

To dość rewolucyjna funkcja, jeśli weźmiemy pod uwagę kilka scenariuszy:

 - Co się stanie, jeśli hub, w którym oparta jest tożsamość, nagle przestanie działać? Bez sklonowania tożsamości członek tego huba nie będzie mógł się komunikować, dopóki hub nie wróci do trybu online (bez wątpienia wielu z Was widziało i przeklęło "Fail Whale" na Twitterze). Dzięki klonowaniu wystarczy zalogować się na sklonowane konto, a życie toczy się normalnie.
 
 - Administrator twojego huba nie może już sobie pozwolić na opłacanie swojego bezpłatnego i publicznego huba $Projectname. Zapowiada, że ​​hub zostanie zamknięty za dwa tygodnie. Dzięki temu masz wystarczająco dużo czasu na sklonowanie swojej tożsamośc i zachowanie relacji, znajomych i treści z zamykanego serwisu $Projectname.
 
 - A jeśli Twoja tożsamość podlega rządowej cenzurze? Twój dostawca huba może zostać zmuszony do usunięcia Twojego konta wraz z wszelkimi tożsamościami i powiązanymi danymi. Dzięki klonowaniu, $Projectname stawia opór cenzurze. Możesz mieć setki klonów, jeśli chcesz, wszystkie nazwane inaczej i istniejące w wielu różnych hubach, rozrzuconych po Internecie.

$Projectname oferuje interesujące nowe możliwości prywatności. Więcej informacji można znaleźć na stronie "Najlepsze praktyki w komunikacji prywatnej".
Obowiązują pewne zastrzeżenia. Aby uzyskać pełne wyjaśnienie klonowania tożsamości, przeczytaj stronę "JAK SKLONOWAĆ SWOJĄ TOŻSAMOŚĆ".

[h4]Wiele profili[/h4]
Można utworzyć dowolną liczbę profili zawierających różne informacje, które mogą być widoczne dla niektórych Twoich kontaktów i znajomych. Profil "domyślny" może być widoczny dla każdego i może zawierać ograniczone informacje, a więcej informacji jest dostępnych dla wybranych grup lub osób. Oznacza to, że profil (i zawartość witryny), który widzą Twoi znajomi pijący piwo, może być inny niż to, co widzą Twoi współpracownicy, a także zupełnie inny niż to, co jest widoczne dla ogółu społeczeństwa. 

[h4]Kopia zapasowa konta[/h4]

$Projectname oferuje prosty sposób wykonywania kopii zapasowej konta za jednym kliknięciem, z której możesz pobrać pełną kopię zapasową swoich profili. Kopie zapasowe można następnie wykorzystać do sklonowania lub przywrócenia profilu.

[h4]Usuwanie konta[/h4]
Konta można natychmiast usunąć, klikając link. Otóż to. Wszystkie powiązane treści są następnie usuwane z siatki (w tym posty i wszelkie inne treści utworzone przez usunięty profil). W zależności od liczby posiadanych połączeń proces usuwania zdalnej zawartości może zająć trochę czasu, ale zaplanowany jest tak szybko, jak to możliwe.

[h4]Usuwanie treści[/h4]
Wszelkie treści utworzone w Hubzilli pozostają pod kontrolą członka (lub kanału), który je pierwotnie utworzył. W dowolnym momencie członek może usunąć wiadomość lub zakres wiadomości. Proces usuwania zapewnia, że treść zostanie usunięta, niezależnie od tego, czy została opublikowana w głównym (macierzystym) hubie kanału, czy w innym hubie, gdzie kanał został zdalnie uwierzytelniony za pośrednictwem Zot (protokół komunikacji i uwierzytelniania $Projectname).

[h4]Media[/h4]
Podobnie jak każdy inny nowoczesny system blogowania, sieć społecznościowa lub usługa mikroblogowania, $Projectname obsługuje przesyłanie plików, osadzanie filmów, łączenie stron internetowych.

[h4]Podgląd i edycja[/h4] 
Posty i komentarze można przeglądać przed wysłaniem i edytować po wysłaniu.

[h4]Głosowanie i konsensus[/h4]
Posty mogą być przekształcane w elementy "konsensusu", które pozwalają czytelnikom oferować opinie, które są zestawiane w liczniki "zgadzam się", "nie zgadzam się" i "wstrzymuję się". Pozwala to ocenić zainteresowanie pomysłami i tworzyć nieformalne ankiety. 

[h4]Rozszerzaie $Projectname[/h4]

$Projectname może zostać rozszerzona na wiele sposobów, poprzez dostosowanie witryny, personalizację, ustawienia opcji, motywy i dodatki - wtyczki. 

[h4]API[/h4]

Interfejs API jest dostępny do użytku przez usługi stron trzecich. Wtyczka zapewnia również podstawową implementację interfejsu API Twittera (dla którego istnieją setki narzędzi innych firm). Dostęp można zapewnić za pomocą loginu i hasła lub protokołu OAuth, a klient może zarejestrować aplikacje OAuth.

