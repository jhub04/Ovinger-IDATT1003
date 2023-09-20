public class TekstBehandlingKlient {
    public static void main(String[] args) {
        TekstBehandling minTekst = new TekstBehandling("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras rhoncus a ligula eget hendrerit. Nunc tincidunt, justo non malesuada ornare, nunc odio finibus odio, in sollicitudin dui neque vel lacus. Nullam facilisis, tellus in aliquet consectetur, enim massa volutpat tortor, vitae pulvinar eros neque vitae diam. Nulla ut augue leo. Mauris vehicula rhoncus quam, eget faucibus felis elementum vel. Fusce pretium volutpat accumsan. Nulla eget orci elit.\n" +
                "\n" +
                "Phasellus ac justo justo. Aenean condimentum mi in elementum suscipit. In hac habitasse platea dictumst. Maecenas quam elit, auctor eu neque sit amet, pulvinar placerat orci. Maecenas vestibulum, purus et sollicitudin mattis, purus eros porttitor massa, nec tincidunt turpis urna vel libero. Curabitur scelerisque id ex vel ullamcorper. Phasellus sodales semper odio, at varius nibh dictum ac.\n" +
                "\n" +
                "Sed ultrices ipsum turpis, at porttitor arcu rutrum et. Morbi pretium nunc nec viverra iaculis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean ultricies dictum arcu, quis accumsan magna hendrerit nec. Vestibulum quis scelerisque orci, at sollicitudin ante. Curabitur fermentum tellus rutrum, ornare justo eget, porta diam. Cras fermentum vulputate dui id iaculis. Integer massa urna, feugiat sed vestibulum eu, bibendum nec nulla.\n" +
                "\n" +
                "Phasellus efficitur viverra odio, id placerat tortor suscipit ut. Donec convallis cursus tellus, sit amet facilisis odio tristique at. Nam vel lacus quis tellus bibendum feugiat sit amet sollicitudin justo. Maecenas hendrerit, est sed elementum pharetra, magna risus aliquam arcu, ut feugiat nunc sapien et libero. Etiam ornare urna ut nibh vestibulum, maximus tincidunt lacus lobortis. In finibus eget tortor eget euismod. Aliquam non magna sapien. Ut dui eros, auctor a pulvinar id, vulputate vitae erat. Duis commodo velit lorem, eu malesuada nulla luctus vel. Donec sit amet tincidunt justo. Nunc in urna at metus faucibus efficitur.\n" +
                "\n" +
                "Aliquam at purus eros. Donec tempus, purus ut cursus varius, orci enim sagittis orci, nec ullamcorper lacus lorem sit amet nisi. Praesent malesuada erat eu dignissim maximus. Donec id sapien ullamcorper, tristique purus ac, efficitur mi. Mauris tortor odio, hendrerit in hendrerit in, hendrerit et lorem. Nam justo ante, dapibus quis interdum eget, aliquam ut magna. Integer pretium, orci eget volutpat sollicitudin, neque diam sodales sapien, in sagittis odio purus eget turpis.");
        System.out.println(minTekst.hentTekst());
        System.out.println(minTekst.hentTekstStor());
        System.out.println(minTekst.antallOrd());
        System.out.println("Den gjennomsnittlige ordlengden er "+ minTekst.ordlengde() + " bokstaver");
        System.out.println("Det er i gjennomsnitt " + minTekst.ordPerPeriode() + " ord per periode");
        System.out.println(minTekst.bytteUtOrd("Lorem", "Yo"));

    }
}
