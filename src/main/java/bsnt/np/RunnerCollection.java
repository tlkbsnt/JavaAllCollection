package bsnt.np;

import bsnt.np.datastructure.collection.HasMapOperations;
import bsnt.np.string.StringOperations;
import bsnt.np.string.StringTokenizers;

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