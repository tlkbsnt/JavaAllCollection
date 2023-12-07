package bsnt.np;

import bsnt.np.collection.HasMapOperations;
import bsnt.np.collection.StringOperations;
import bsnt.np.collection.StringTokenizers;

public class RunnerCollection {
    public static void main(String[] args) {
        var opt =  new HasMapOperations();
        opt.display();

        StringOperations so = new StringOperations();
        so.stringOperation();


        StringTokenizers stringTokenizers = new StringTokenizers();
        stringTokenizers.stringTokenizers();
    }
}