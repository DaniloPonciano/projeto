package projeto.DataInitializer;


import org.springframework.stereotype.Component;
import projeto.models.Bairro;
import projeto.Repository.BairroRepository;


@Component
public class BairroInitializer {

    @DataInitializerType(repository = BairroRepository.class, model = Bairro.class)
    private String[] bairros = {
    "Agua Verde",
    "Águas Claras",
    "Amizade",
    "Barra do Rio Cerro",
    "Barra do Rio Molha",
    "Boa Vista",
    "Braço do Ribeirão Cavalo",
    "Centro",
    "Centenário",
    "Centro Histórico",
    "Chico de Paulo",
    "Cidade Nova",
    "Czerniewicz",
    "Encosta do Sol",
    "Fazenda do Cedro",
    "Garden City",
    "Gracia",
    "Grande Hinterland",
    "Ilha da Figueira",
    "Industrial",
    "Jaraguá Centro",
    "Jaraguá Velho",
    "Linha Auxiliar Norte",
    "Linha Colombo",
    "Linha Ferreira",
    "Linha Progresso",
    "Loteamento Cavasotto",
    "Manhattan",
    "Maravilha",
    "Matador",
    "Molda Quente",
    "Monte Carlo",
    "Nossa Senhora do Amparo",
    "Nova Brasília",
    "Nova Esperança",
    "Nova Hartz",
    "Parque das Palmeiras",
    "Parque São José",
    "Patrícia",
    "Progresso",
    "Quedas do Salto",
    "Rio Cerro I",
    "Rio Cerro II",
    "Rio Molha",
    "Saguaçu",
    "Salto Saudade",
    "Santa Luzia",
    "São Bento",
    "São Francisco",
    "São João",
    "São Luís",
    "São Roque",
    "Tifa Martins",
    "Vila Baependi",
    "Vila Cavasotto",
    "Vila Conceição",
    "Vila Cooperativa",
    "Vila Deolino",
    "Vila Flor",
    "Vila Herthel",
    "Vila Jataí",
    "Vila Lenzi",
    "Vila Nova",
    "Vila Operária",
    "Vila Progresso",
    "Vila Rezende",
    "Wiedenmann"
    };
}
