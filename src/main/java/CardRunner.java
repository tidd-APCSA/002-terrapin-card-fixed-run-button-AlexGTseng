public class CardRunner {
    public static void main(String args[]){
        // ☕
        
        // TerrapinCard card = new TerrapinCard(50);
        // System.out.println(card);
        // card.payGourmet();
        // System.out.println(card);
        // card.loadMoney(-10);
        // System.out.println(card);

        TerrapinCard cardBilly = new TerrapinCard(20);
        TerrapinCard cardBrian = new TerrapinCard(30);

        cardBilly.payGourmet();
        cardBrian.payEconomical();

        System.out.println("Billy: " + cardBilly);
        System.out.println("Brian: " + cardBrian);

        cardBilly.loadMoney(20);
        cardBrian.payGourmet();

        System.out.println("Billy: " + cardBilly);
        System.out.println("Brian: " + cardBrian);

        cardBilly.payEconomical();
        cardBilly.payEconomical();
        cardBrian.loadMoney(50);

        System.out.println("Billy: " + cardBilly);
        System.out.println("Brian: " + cardBrian);
    }
}
