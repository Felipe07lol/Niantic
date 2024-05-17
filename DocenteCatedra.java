
/**
 * Write a description of class DocenteCatedra here.
 * 
 * @author (Luis Felipe) 
 * @version (26/04/2024)
 */
public class DocenteCatedra extends DepartamentoAcademico
{
    private String nombre;
    private int codigo;
    private String tituloProfe;
    private boolean concursoMeritos = true;
    private int cursoDocencia;
    public double SMMLV = 1300000;
    private double horaCatedra;
    private int docenciaUni;
    private String trabajoEscrito;
    private String cursoActualizacion;
    private Categoria categoria;
    public int mes;
    public int año;
    
    
    
    //Constructor
    public DocenteCatedra(String nombre, int codigo, String tituloProfe, boolean concursoMeritos, int cursoDocencia, double SMMLV, double horaCatedra, int docenciaUni, String trabajoEscrito, String cursoActualizacion)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tituloProfe = tituloProfe;
        this.concursoMeritos = concursoMeritos;
        this.cursoDocencia = cursoDocencia;
        this.SMMLV = SMMLV;
        this.horaCatedra = horaCatedra;
        this.docenciaUni = docenciaUni;
        this.trabajoEscrito = trabajoEscrito;
        this.cursoActualizacion = cursoActualizacion;
    }
    
    //Get and Set
    public String getNombre()
    {
        return nombre;
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getTituloProfe()
    {
        return tituloProfe;
    }
    
    public boolean getConcursoMeritos()
    {
        return concursoMeritos;
    }
    
    public int getCursoDocencia()
    {
        return cursoDocencia;
    }
    
    public double getSMMLV()
    {
        return SMMLV;
    }
    
    public double getHoraCatedra()
    {
        return horaCatedra;
    }
    
    public int getDocenciaUni()
    {
        return docenciaUni;
    }
    
    public String getTrabajoEscrito()
    {
        return trabajoEscrito;
    }
    
    public String getCursoActualizacion()
    {
        return cursoActualizacion;
    }
    
    public void setNombre(String newNombre)
    {
        this.nombre = newNombre;
    }
    
    public void setCodigo(int newCodigo)
    {
        this.codigo = newCodigo;
    }
    
    public void setTituloProfe(String newTituloProfe)
    {
        this.tituloProfe = newTituloProfe;
    }
    
    public void setConcursoMeritos(boolean newConcursoMeritos)
    {
        this.concursoMeritos = newConcursoMeritos;
    }
    
    public void setCursoDocencia(int newCursoDocencia)
    {
        this.cursoDocencia = newCursoDocencia;
    }
    
    public void setSMMLV(double newSMMLV)
    {
        this.SMMLV = newSMMLV;
    }
    
    public void setHoraCatedra(double newHoraCatedra)
    {
        this.horaCatedra = newHoraCatedra;
    }
    
    public void setDocenciaUni(int newDocenciaUni)
    {
        this.docenciaUni = newDocenciaUni;
    }
    
    public void setTrabajoEscrito(String newTrabajoEscrito)
    {
        this.trabajoEscrito = newTrabajoEscrito;
    }
    
    public void setCursoActualizacion(String newCursoActualizacion)
    {
        this.cursoActualizacion = newCursoActualizacion;
    }
    
    //Operaciones
    public void identificarSalarioDocenteCatedra()
    {
        if(categoria == Categoria.AUXILIAR)
        {
            int experiencia = docenciaUni = mes = 4;
            horaCatedra = 40000;
            double salario = horaCatedra * SMMLV;
            System.out.println("El docente es de categoria auxiliar y su salario es: " + salario);
        }else if(categoria == Categoria.ASISTENTE)
        {
            docenciaUni = año = 4;
            cursoActualizacion = "Presentado";
            trabajoEscrito = "Presentado";
            horaCatedra = 45000;
            double salario = horaCatedra * SMMLV;
            System.out.println("El docente es de categoria asistente y su salario es: " + salario);
        }else if(categoria == Categoria.ASOCIADO)
        {
            docenciaUni = año = 6;
            cursoActualizacion = "Presentado";
            trabajoEscrito = "Presentado";
            horaCatedra = 50000;
            double salario = horaCatedra * SMMLV;
            System.out.println("El docente es de categoria asociado y su salario es: " + salario);
        }else if(categoria == Categoria.TITULAR)
        {
            docenciaUni = año = 8;
            cursoActualizacion = "Presentado";
            trabajoEscrito = "2 Presentado";
            horaCatedra = 55000;
            double salario = horaCatedra * SMMLV;
            System.out.println("El docente es de categoria titular y su salario es: " + salario);
        }
    }
    
    
    
    
}
