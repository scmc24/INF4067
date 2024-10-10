package singletonExample.construction.singleton;

public class TestOperationMathematique {
    
    public static void main(String[] args) {
        
        int som = OperationMathematique.getInstance().somme(2, 5);
        System.out.printf("la somme est %d",som);

        OperationMathematique s1 = OperationMathematique.getInstance(8, 3);
        s1.affiche();

        OperationMathematique s2 = OperationMathematique.getInstance(5, 9);
        s2.affiche();

        OperationMathematique s3 = OperationMathematique.getInstance(8, 3, 5);
        s3.affiche();

        OperationMathematique s4 = OperationMathematique.getInstance(8, 5, 9);
        s4.affiche();

    }
}
