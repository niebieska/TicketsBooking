# Book-Tickets - System sprzedaży(rezerwacji) biletów kinowych
 
Aplikacja umożliwia rezerwację biletów na seans kinowy.
System wystawia zewnętrzny interfejs REST umożliwiający elektroniczną weryfikację biletu.

//W zwiazku z kolumnową realizacją poszczególnych elementów projektu.
//Został on podzielony na następujące cześci:


1)Proces wyboru filmu ma charakter statyczny. Istnieje skończona ilość dostępnych filmów wraz z lakonicznym opisem,
dla których można dokonać zakupu lub rezerwacji biletu.( wybór filmu, wybór godziny, rozpoczecie procesu zakupu/rezerwacji)

2)Część obejmująca wizualizację sali kinowej umożliwiająca wybór konkretnego miejsca (można wybrać dowolną liczbę miejsc z dostępnych),
 decyzję o  rezerwacji lub zakupie oraz uzupełnienie danych kupującego, a w przypadku zakupu decyzję o typie biletu i metodzie płatności.
( Płatność obejmuje zewnętrzny system)
W przypadku rezerwacji wygenerowanie "miejscówki" o określonej ważności,weryfikowanej przez system przy kasie. 
W przypadku zakupu biletu wygenerowanie jego treści i kodu QR/ tokenu sprawdzanego przez biletera.
 
 
3) Weryfikacja w biletów( rezerwacji) w systemie zewnętrznym.
