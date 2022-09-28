package jti.amel.a04androidrecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> descMakanan = new ArrayList<>();
    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> bahanMakanan = new ArrayList<>();
    private ArrayList<String> caraMembuat = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromInternet();
    }

    private void recyclerViewProcess(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.Adapter adapter = new RecipeAdapter(namaMakanan, descMakanan, fotoMakanan, bahanMakanan, caraMembuat, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Easy Teriyaki Chicken");
        descMakanan.add("Try this easy, sticky Asian-style teriyaki chicken for a speedy weeknight supper " +
                "– it takes just 20 minutes to make! Serve it with sticky rice and steamed greens");
        fotoMakanan.add("https://img.freepik.com/free-photo/fried-chicken_155003-362.jpg");
        bahanMakanan.add("Ingredients:\n " +
                "2 tbsp toasted sesame oil\n" +
                "6 skinless and boneless chicken thighs, sliced\n" +
                "2 large garlic cloves, crushed\n" +
                "1 thumb-sized piece ginger, grated\n" +
                "50g runny honey\n" +
                "30ml light soy sauce\n" +
                "1 tbsp rice wine vinegar\n" +
                "1 tbsp sesame seeds , to serve\n" +
                "4 spring onions, shredded, to serve\n" +
                "sticky rice, to serve\n" +
                "steamed bok choi or spring greens, to serve");
        caraMembuat.add("Procedure:\n " +
                "1. Heat the oil in a non-stick pan over a medium heat. Add the chicken and fry for 7 mins, or until golden. " +
                "Add the garlic and ginger and fry for 2 mins. Stir in the honey, soy sauce, vinegar and 100ml water. Bring to the boil " +
                "and cook for 2 - 5 mins over a medium heat until the chicken is sticky and coated in a thick sauce.\n" +
                "2. Scatter over the spring onions and sesame seeds, then serve the chicken with the rice and steamed veg.");

        namaMakanan.add("Vegetarian Lasagne");
        descMakanan.add("Make our easy vegetarian lasagne using just a handful of ingredients. You can use ready" +
                "-made tomato sauce and white sauce, or batch cook the sauces and freeze them");
        fotoMakanan.add("https://images.immediate.co.uk/production/volatile/sites/30/2022/02/vegetarian-lasagne-5ee6162.jpg");
        bahanMakanan.add("Ingredients:\n " +
                "3 red peppers, cut into large chunks\n" +
                "2 aubergines, cut into ½ cm thick slices\n" +
                "8 tbsp olive oil, plus extra for the dish\n" +
                "300g lasagne sheets\n" +
                "125g mozzarella\n" +
                "handful cherry tomatoes, halved\n" +
                "For the tomato sauce\n" +
                "1 tbsp olive oil\n" +
                "2 onions, finely chopped\n" +
                "2 garlic cloves, sliced\n" +
                "1 carrot, roughly chopped\n" +
                "2 tbsp tomato purée\n" +
                "200ml white wine\n" +
                "3 x 400g cans chopped tomatoes\n" +
                "1 bunch of basil, leaves picked\n" +
                "For the white sauce\n" +
                "85g butter\n" +
                "85g plain flour\n" +
                "750ml milk");
        caraMembuat.add("Procedure:\n " +
                "1. To make the tomato sauce, heat the olive oil in a saucepan. Add the onions, garlic and carrot. Cook for 5-7 mins over a medium heat until softened. " +
                "Turn up the heat a little and stir in the tomato purée. Cook for 1 min, pour in the white wine, then cook for 5 mins until this has reduced by two-thirds. " +
                "Pour over the chopped tomatoes and add the basil leaves. Bring to the boil then simmer for 20 mins. Leave to cool then whizz in a food processor. Will keep, cooled, " +
                "in the fridge for up to three days or frozen for three months.\n" +
                "2. To make the white sauce, melt the butter in a saucepan, stir in the plain flour, then cook for 2 mins. Slowly whisk in the milk, then bring to the boil, stirring. " +
                "Turn down the heat, then cook until the sauce starts to thicken and coats the back of a wooden spoon. Will keep, cooled, in the fridge for up to three days or frozen for three months.\n" +
                "3. Heat the oven to 200C/180C fan/gas 6. Lightly oil two large baking trays and add the peppers and aubergines. Toss with the olive oil, season well, then roast for 25 mins until lightly browned.\n" +
                "4. Reduce the oven to 180C/160C fan/gas 4. Lightly oil a 30 x 20cm ovenproof dish. Arrange a layer of the vegetables on the bottom, then pour over a third of the tomato sauce. " +
                "Top with a layer of lasagne sheets, then drizzle over a quarter of the white sauce. Repeat until you have three layers of pasta.\n" +
                "5. Spoon the remaining white sauce over the pasta, making sure the whole surface is covered, then scatter over the mozzarella and cherry tomatoes. Bake for 45 mins until bubbling and golden.");

        namaMakanan.add("Cajun Fried Shrimp");
        descMakanan.add("Fry up a batch of crispy Cajun spiced shrimps – they are completely addictive. " +
                "Put the beer on ice, too, for an informal dinner with friends and family");
        fotoMakanan.add("https://img.freepik.com/free-photo/side-view-tempura-shrimps-with-sweet-chili-sauce-slice-lemon-black-olive-plate_141793-5136.jpg");
        bahanMakanan.add("Ingredients:\n " +
                "500g extra-large raw king prawns\n" +
                "284ml tub buttermilk\n" +
                "100g polenta\n" +
                "100g cornflour\n" +
                "1 tsp mustard powder\n" +
                "For the mayo\n" +
                "4 tbsp mayonnaise\n" +
                "1 tbsp hot sauce\n" +
                "For the Cajun spice mix\n" +
                "2 tbsp paprika\n" +
                "4 tsp garlic powder\n" +
                "4 tsp cayenne pepper\n" +
                "2 tsp ground black pepper\n" +
                "2 tsp onion powder\n" +
                "1 tsp dried thyme\n" +
                "1 tsp dried oregano");
        caraMembuat.add("Procedure:\n " +
                "1. Stir all the ingredients for the mayo together, adding lime juice to taste. Set aside.\n" +
                "2. Coat the prawns in ½ tbsp Cajun spice mix. Decant the buttermilk into a bowl and give it a good stir to loosen slightly. " +
                "In another bowl, mix the polenta, cornflour, mustard powder and remaining Cajun spice mix together.\n" +
                "3. Fill a deep frying pan 2 inches full with oil. Heat to 180C on a cooking thermometer, or until a piece of bread browns in 20 seconds when it is dropped in the oil. " +
                "Dip each seasoned prawn briefly in the buttermilk then coat in the flour mixture. Fry the prawns for 1-2 mins on each side until golden brown and curled. Drain on kitchen paper, then serve with the mayo and lime wedges for squeezing over.");

        namaMakanan.add("Caramel Apple Loaf Cake");
        descMakanan.add("Moist cake topped with a sticky, crunchy topping will keep your guests coming back for more");
        fotoMakanan.add("https://img.freepik.com/free-photo/closeup-sliced-apple-pie-with-sugar-powder-plate-table_181624-58479.jpg");
        bahanMakanan.add("Ingredients:\n " +
                "175g soft butter, plus extra for greasing\n" +
                "175g golden caster sugar\n" +
                "1 tsp vanilla extract\n" +
                "2 eggs\n" +
                "225g self-raising flour\n" +
                "½ tsp cinnamon\n" +
                "4 rounded tbsp Greek yogurt\n" +
                "2 eating apples\n" +
                "50g walnuts, very roughly chopped, plus 1 tbsp extra, chopped\n" +
                "50g soft toffee (we used Werther's chewy toffees)\n" +
                "2 tbsp double cream");
        caraMembuat.add("Procedure:\n " +
                "1. Heat oven to 160C/140C fan/gas 3. Grease a 2lb loaf tin and line the base and ends with a long strip of baking paper.\n" +
                "2. Beat together the butter, sugar and vanilla until pale, then beat in the eggs, one by one. Tip in the flour, cinnamon and yogurt. Peel, core and chop apples into small chunks, " +
                "then add to the bowl and mix everything together with a wooden spoon.\n" +
                "3. Scrape into the tin, smooth the top and scatter the walnuts down the middle. Bake on a middle shelf for 1 hr 20-30 mins until a skewer poked in comes out clean. Cool in the tin.\n" +
                "4. To decorate, put the toffees in a small saucepan with the double cream. Gently heat, stirring, until toffees have melted into a smooth caramel sauce. Cool for about 1 min while you gently turn out the cake. " +
                "Slowly drizzle the toffee sauce over the top of the cake. Scatter immediately with the extra walnuts – they should stick where they hit toffee. Leave for 10 mins before serving. Best fresh but will keep in an airtight tin for 3-4 days.");

        namaMakanan.add("Chicken Noodle Soup");
        descMakanan.add("Mary Cadogan's aromatic broth will warm you up on a winter's evening - it contains ginger, " +
                "which is particularly good for colds.");
        fotoMakanan.add("https://img.freepik.com/free-photo/instant-noodles-soup-eat-sliced-onions-peppers-put-pork-into-top-view_1150-47095.jpg");
        bahanMakanan.add("Ingredients:\n " +
                "900ml chicken or vegetable stock (or Miso soup mix)\n" +
                "1 boneless, skinless chicken breast (about 175g)\n" +
                "1 tsp chopped fresh ginger\n" +
                "1 garlic clove, finely chopped\n" +
                "50g rice or wheat noodles\n" +
                "2 tbsp sweetcorn, canned or frozen\n" +
                "2-3 mushrooms, thinly sliced\n" +
                "2 spring onions, shredded\n" +
                "2 tsp soy sauce, plus extra for serving\n" +
                "mint or basil leaves and a little shredded chilli (optional), to serve");
        caraMembuat.add("Procedure:\n " +
                "1. Pour the stock into a pan and add the chicken breast, ginger and garlic. Bring to the boil, then reduce the heat, partly cover and simmer for 20 mins, " +
                "until the chicken is tender.\n" +
                "2. Put the chicken on a board and shred into bite-size pieces using a couple of forks. Return the chicken to the stock with the noodles, sweetcorn, mushrooms, " +
                "spring onion and soy sauce. Simmer for 3-4 mins until the noodles are tender.\n" +
                "3. Ladle into two bowls and scatter over the remaining spring onion, mint or basil leaves and chilli, if using. Serve with extra soy sauce.");

        namaMakanan.add("Chicken cacciatore one-pot with orzo");
        descMakanan.add("Enjoy comfort food at its best with this chicken cacciatore. The orzo soaks up the flavours of" +
                " chicken and tomatoes as it cooks, making a wonderfully rich pasta bake");
        fotoMakanan.add("https://img.freepik.com/free-photo/flat-lay-gourmet-dish_23-2148322821.jpg");
        bahanMakanan.add("Ingredients:\n " +
                "2 tbsp olive oil\n" +
                "4-6 skin-on, bone-in chicken thighs\n" +
                "1 onion , finely sliced\n" +
                "2 garlic cloves , sliced\n" +
                "250ml red wine\n" +
                "2 bay leaves\n" +
                "4 thyme sprigs\n" +
                "2 rosemary sprigs\n" +
                "small bunch of parsley , stalks and leaves separated, finely chopped\n" +
                "2 x 400g cans cherry tomatoes\n" +
                "1 chicken stock cube\n" +
                "1 tbsp balsamic vinegar\n" +
                "2 tbsp capers (optional)\n" +
                "handful of pitted green olives\n" +
                "300g orzo , rinsed (to keep it from getting too sticky when baked)");
        caraMembuat.add("Procedure:\n " +
                "1. Heat the oven to 220C/200C fan/gas 7. Rub 1 tbsp oil over the chicken and season well, then put skin-side up in an ovenproof casserole dish " +
                "or roasting tin and bake for 20-25 mins until crisp and golden, but not cooked all the way though. Remove from the dish and put on a plate.\n" +
                "2. Add the remaining oil to the dish, mixing it with the chicken fat. Tip in the onion and garlic, then bake for 5-8 mins until the onion is tender.\n" +
                "3. Pour in the wine, stirring it with the onions, then leave to evaporate slightly in the residual heat before adding the bay, thyme, rosemary, parsley stalks " +
                "and tomatoes. Dissolve the stock cube in 300ml boiling water and pour this in, then add the vinegar, capers, if using, olives and orzo. Stir well and season.\n" +
                "4. Nestle the chicken back in the pan, skin-side up, and roast for 20 mins until the sauce is thickened, the orzo is tender and the meat is cooked through. Give it a stir, " +
                "then leave for 10 mins for the orzo to absorb the excess liquid. Scatter over the parsley leaves to serve.");

        namaMakanan.add("Sausage & Mushroom ragu");
        descMakanan.add("Do something different with sausages and transform them into this veg-packed ragu. " +
                "Great for a family dinner, serve with couscous, mash or pasta");
        fotoMakanan.add("https://img.freepik.com/free-photo/side-view-baked-meat-clay-pot-with-dried-fruits-onions-salt-pepper-newspaper_141793-12492.jpg");
        bahanMakanan.add("Ingredients:\n " +
                "2 tbsp olive oil\n" +
                "1 carrot, grated\n" +
                "3 spring onions, finely chopped\n" +
                "2 garlic cloves, grated\n" +
                "large handful of mushrooms, finely chopped or grated\n" +
                "1 tsp dried oregano\n" +
                "1 tsp fennel seeds\n" +
                "6 pork sausages, squeezed out of their skins\n" +
                "400g can chopped tomatoes\n" +
                "1 tbsp tomato ketchup\n" +
                "mash, pasta or couscous, to serve");
        caraMembuat.add("Procedure:\n " +
                "1. Heat the oil in a saucepan over a medium heat and tip in the carrot, spring onions, garlic, mushrooms, oregano and fennel, " +
                "along with a pinch of salt. Cook for about 5 mins.\n" +
                "2. Add the sausagemeat and cook until browned all over, then add the chopped tomatoes and ketchup, along with a pinch of salt and 100ml water. " +
                "Reduce the heat to low, cover and cook until the sauce is thick, about 20 mins, stirring now and again. Season to taste, then serve with buttery mashed potato, pasta or couscous.");

        recyclerViewProcess();

    }
}