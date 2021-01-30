[h2]Błędy, problemy i rzeczy, które pojawiają się w nocy ...[/h2]
[h3]Coś poszło nie tak! Kto jest odpowiedzialny za naprawianie tego?[/h3]

[b]$Projectname Community Server[/b]

$Projectname Community Server to oprogramowanie typu Open Source, które jest utrzymywane przez "społeczność" - zasadniczo nieopłacanych ochotników. Nikt nie jest odpowiedzialny za naprawianie błędów. Pracujemy razem, aby oprogramowanie i sieć działały płynnie i bez błędów. Jesteś członkiem tej społeczności, więc potrzebujemy również Twojej pomocy, aby zapewnić wysokiej jakości oprogramowanie. Nie ma mitycznych "programistów", którzy w magiczny sposób wszystko naprawiają. Do nas wszystkich należy włączenie się i pomoc.

Pierwszą rzeczą, którą musisz zrobić, jest porozimieć się z administratorem huba - osobą, która obsługuje Twoją witrynę i zarządza nią. Znajdują się ona w wyjątkowej sytuacji, ponieważ ma dostęp do wewnętrznego oprogramowania i bazy danych oraz [b]plików dziennika[/b] i będzie musiała zaangażować się w naprawę problemu. Inne osoby "w sieci" nie mogą naprawdę Ci tym pomóc. Pierwszą rzeczą, jaką musi zrobić administrator huba, jest przejrzenie dzienników i podjecie próby odtworzenia problemu. Dlatego staraj się być tak pomocny i uprzejmy, jak to tylko możliwe, pomagając mu przyjrzeć się problemowi. 

Aby znaleźć swojego administratora huba (jeśli nie wiesz, kim on jest), zajrzyj na [url=[baseurl]/siteinfo]tą stronę[/url]. Jeśli nie podał on żadnych informacji kontaktowych na tej stronie lub nie podał "Impressum", zobacz [url=[baseurl]/siteinfo.json]podsumowanie informacji o tej witrynie[/url] znajdujące się pod nagłówkiem "admin:".

Zdecydowanie zaleca się, aby administratorzy huba wypełniali raporty o błędach, tak aby możliwe było dołączenie odpowiedniego plik dziennika i informacji z bazy danych istotnych dla problemu oraz aby byli oni gotowi do wypróbowania rozwiązań i testów uzupełniających. Bez tego poziomu współpracy rozwiązanie problemu może nie być możliwe.

[h3]Jestem administratorem huba, co mam zrobić?[/h3]

Oprogramowania zapewniające tą usługę sieciową jest typu Open Source i jest dostępne do wglądu. Zachęcamy wszystkich do zapoznania się z kodem i zobaczenia, jak wszystko działa i sprawdzenia, czy nie robimy nic złego lub niedbałego. Jeśli został zgłoszony komunikat o błędzie, często można przeszukać pliki źródłowe tego komunikatu o błędzie i dowiedzieć się, co go spowodowało. Dzięki tym informacjom i plikom dziennika serwisu możliwe będzie ustalenie sekwencji zdarzeń prowadzących do błędu. Problem mogą powodować również serwisy zewnętrzne i jego źródłem wcale nie musi być Twój serwis, ale inne miejsce w sieci. Spróbuj określić punkty końcowe komunikacji (huby lub serwisy), których dotyczy problem i skontaktuj się z administratorem tego serwisu lub tych serwisów. Spróbuj podać czas zdarzenia, w którym coś poszło nie tak, aby można go było znaleźć w dziennikach. Współpracuj z innymi administratorami, aby spróbować znaleźć przyczynę problemu. Pliki dziennika są Twoim przyjacielem. Kiedy w oprogramowaniu dzieje się coś, czego się nie spodziewaliśmy, prawie zawsze zostało to zarejestrowane.

[h3]Biały ekran śmierci[/h3]

Jeśli podczas robienia czegoś pojawia się pusty biały ekran, prawie zawsze jest to błąd kodu lub składni. W pliku .htconfig.php serwisu znajdują się instrukcje, które pozwolą administratorowi witryny na włączenie rejestrowania składni. Zalecamy wszystkim witrynom korzystanie z tego. Po włączeniu rejestrowania składni powtórz sekwencję, która doprowadziła do błędu, a powinna ona zarejestrować nieprawidłową linię kodu. Mamy nadzieję, że dzięki tym informacjom uda Ci się rozwiązać problem. Gdy to zrobisz, prześlij poprawkę "upstream", abyśmy mogli udostępnić poprawkę pozostałym członkom projektu i innym społecznościom. To jest kluczowa zaleta korzystania z oprogramowania Open Source - dzielimy się mim wszyscy.

[h3]Jestem głupi. Nie wiem, co jest nie tak.[/h3]

W tej sytuacji warto omówić tę kwestię na jednym z forów internetowych. Może być ich kilka, a niektóre mogą bardziej pasować do Twojego ojczystego języka. W tej chwili kanał "Hubzilla Support" (support@zotadel.net) jest zalecanym forum do omawiania błędów.

Jeśli członkowie społeczności z wykształceniem i doświadczeniem w zakresie inżynierii oprogramowania nie mogą Ci od razu pomóc, zrozum, że są wolontariuszami i mogą mieć dużo innej pracy i zobowiązań w tym czasie. W tym momencie musisz zgłosić błąd. Aby to zrobić, będziesz potrzebować konta na framagit.org. Zarejestruj się, a następnie odwiedź https://framagit.org/hubzilla/core/issues. Utwórz tutaj problem i podaj wszystkie te same informacje, które podałeś online. Nie pomijaj niczego.

Następnie musisz zaczekać. Jeśli jest to poważny problem, może zostać szybko rozwiązany, ale nikt nie jest odpowiedzialny za naprawianie błędów. Jeśli problem utrzymuje się bez rozwiązania, poświęć trochę czasu na zbadanie samemu problemu. Zapytaj o wszystko, czego nie rozumiesz a co jest związane z tym problemem. Dowiesz się więcej o tym, jak działa oprogramowanie i prawdopodobnie dowiesz się, dlaczego teraz nie działa. Ostatecznie to ktoś w społeczności ma zamiar to naprawić, a ty jesteś członkiem społeczności. Tak właśnie działa proces Open Source.

Inne osoby pracujące nad rozwiązaniem problemu mogą potrzebować dowiedzieć się więcej, więc odrób swoją pracę domową i udokumentuj, co się dzieje i wszystko, czego próbowałeś. Nie mów "Zrobiłem xyz i to nie działa". To nam nic nie mówi. Powiedz nam dokładnie, jakie kroki podjąłeś i jaki był rezultat, a także co się w rezultacie wydarzyło. Jaką stronę (URL) przeglądałeś lub jaki formularz wypełniałeś? Jeśli były jakieś komunikaty o błędach, nie mów "wystąpił komunikat o błędzie". Powiedz nam dokładnie, o czym była wiadomość. Powiedz nam również, z jakiego huba korzystasz, jakiej wersji oprogramowania używasz i wszelkie inne szczegóły, które mogą być unikalne na temat konfiguracji Twojej witryny. Rozumie się, że możesz chcieć zachować prywatność niektórych informacji i swoich połączeń, jednak jeśli nie chcesz udostępniać informacji potrzebnych innym osobom do odtworzenia i rozwiązania problemu, może on nie zostać naprawiony.
     
