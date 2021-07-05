package Tree;


class Arbol {
	private NodoArbol raiz;
    public Arbol() {
    	raiz = null;
    }
    public synchronized void InsertarNodo(int valorInsertar){
    	if(raiz==null) raiz = new NodoArbol(valorInsertar);
    	else raiz.insertar(valorInsertar);
    }
    public synchronized void RecorridoPreorden(){
    	ayudantepreoden(raiz);
    }
    private void ayudantepreoden(NodoArbol nodo){
    	if(nodo == null )return ;
    	System.out.println(nodo.datos + " ");
    	ayudantepreoden(nodo. nodoizquierdo);
    	ayudantepreoden(nodo.nododerecho);
    }
    public synchronized void RecorridoInorden(){
    	ayudanteinorden(raiz);
    }
    private void ayudanteinorden(NodoArbol nodo){
    	if(nodo == null) return;
    	ayudanteinorden(nodo. nodoizquierdo);
    	System.out.println(nodo.datos + " ");
    	ayudanteinorden(nodo.nododerecho);
    }
    public synchronized void RecorridoPosorden(){
    	ayudanteposorden(raiz);
    }
    private void ayudanteposorden(NodoArbol nodo){
    	if(nodo == null )return ;
    	ayudanteposorden(nodo. nodoizquierdo);
    	ayudanteposorden(nodo.nododerecho);
    	System.out.println(nodo.datos + " ");
    }
}
