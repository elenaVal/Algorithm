package kuvaldis.algorithm.graph.weighted;

import kuvaldis.algorithm.graph.weighted.domain.WeightedEdge;
import kuvaldis.algorithm.graph.weighted.domain.WeightedGraph;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MinimalSpanningTreePrimTest extends AbstractSpanningTreeTest {

    @Test
    public void testBuild() throws Exception {
        final WeightedGraph graph = WeightedGraphUtils.fromSource("graph.txt", false);
        final Set<WeightedEdge> edges = new MinimalSpanningTreePrim(graph).build();
        assertNotNull(edges);
        assertEquals(graph.size() - 1, edges.size());
        assertTrue(contains(edges, 1, 2, 1));
        assertTrue(contains(edges, 1, 6, 1));
        assertTrue(contains(edges, 1, 5, 2));
        assertTrue(contains(edges, 2, 3, 3));
        assertTrue(contains(edges, 3, 4, 3));
    }
}