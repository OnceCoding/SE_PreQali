/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_preqali;

/**
 *
 * @author javierfuenteshuertas
 */
public class MalnutritionFuzzy {
    float weight;
    float height;
    float age;
    boolean edema;
    boolean emacion;
    boolean palidezPalmar;
    public MalnutritionFuzzy(float weight,float height, float age){
        this.weight=weight;
        this.height=height;
        this.age=age;
        edema=false;
        emacion=false;
        palidezPalmar=false;
    }
    public String fuzzificationWeight(float weight,float age){
        float valuePercentil=WEIGHT.weight.get(age);
        float percentil=(weight/valuePercentil)*100;
        if(percentil>90f)return "NORMAL"; //normal
        else if(percentil>80f && percentil<90f)return "DESNUTRIDO_I"; //bajo
        else if(percentil>70f && percentil<80f)return "DESNUTRIDO_II"; //muy bajo
        else if(percentil>60f && percentil<70f)return "DESNUTRIDO_III"; //extremadamente bajo
        else return "DESNUTRIDO_IV";
    }
    public String fuzzificationHeight(float height,float age){
        float valuePercentil=HEIGHT.height.get(age);
        float percentil=(height/valuePercentil)*100;
        if(percentil>95f)return "NORMAL";
        else if(percentil>90f && percentil<95f)return "DESNUTRIDO_LEVE";
        else if(percentil>85f && percentil<90f)return "DESNUTRIDO_MODERADO";
        else return "DESNUTRIDO_SEVERO";
    }
    public String rulers(){
        String weightString=this.fuzzificationWeight(weight, age);
        String heightString=this.fuzzificationHeight(height, age);
        if(weightString.equals("DESNUTRIDO_I") && heightString.equals("DESNUTRIDO_LEVE")&& !edema && !emacion && !palidezPalmar) return "BAJO";
        else if(weightString.equals("DESNUTRIDO_II") && heightString.equals("DESNUTRIDO_LEVE")&& !edema && !emacion && !palidezPalmar) return "BAJO";
        else if(weightString.equals("DESNUTRIDO_I") && heightString.equals("DESNUTRIDO_MODERADO")&& !edema && !emacion && !palidezPalmar) return "MEDIO";
        else if(weightString.equals("DESNUTRIDO_II") && heightString.equals("DESNUTRIDO_MODERADO")&& !edema && !emacion && !palidezPalmar) return "MEDIO";
        else if(weightString.equals("DESNUTRIDO_III") || heightString.equals("DESNUTRIDO_SEVERO")) return "ALTO";
        else return "NORMAL";
    }
}
