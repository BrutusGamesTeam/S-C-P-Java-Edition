// Pacote do Código
package org.scp.api.java.math;

/**
 * Vetor Bi-Dimensional Comum
 */
public class Vector2
{
    // Campos Exclusívos da Classe

    // Coordenada X do Vetor
    private float x;

    // Coordenada Y do Vetor
    private float y;

    // Construtores Básicos

    /**
     * Cria uma noa Instância do Vetor
     * @param xAxis O Eixo X do novo Vetor
     * @param yAxis O Eixo Y do novo Vetor
     */
    public Vector2(float xAxis, float yAxis)
    {
        this.x = xAxis;
        this.y = yAxis;
    }

    // Funções Declaradas
    
    /**
     * Obtém a Distância entre este Vetor e outro
     * @param other Indica o Vetor para ser Calculado
     * @return A Distância Totalizada entre Ambos
     */
    public float vector_getDistanceTo(Vector2 other)
    {
        float dx = this.vector_getXCoord() - other.vector_getXCoord();
        float dy = this.vector_getYCoord() - other.vector_getYCoord();
        
        return (float)(Math.sqrt(dx * dx + dy * dy));
    }

    /**
     * Obtém o Valor da Coordenada X
     * @return O Valor da Coordenada X deste Vetor
     */
    public float vector_getXCoord()
    {
        return x;
    }

    /**
     * Obtém o Valor da Coordenada Y
     * @return O Valor da Coordenada Y deste Vetor
     */
    public float vector_getYCoord()
    {
        return y;
    }

    /**
     * Mude o Valor da Coordenada X
     * @param value A nova Coordenada X deste Vetor
     */
    public void vector_setXCoord(float value)
    {
        x = value;
    }

    /**
     * Mude o Valor da Coordenada Y
     * @param value A nova Coordenada Y deste Vetor
     */
    public void vector_setYCoord(float value)
    {
        y = value;
    }
}
