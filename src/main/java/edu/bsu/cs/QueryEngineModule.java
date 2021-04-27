package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.model.*;

import java.time.Duration;

public class QueryEngineModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(QueryEngine.class).to(WikipediaQueryEngine.class);
        bind(Duration.class).toInstance(Duration.ofSeconds(2));
        bind(IFormatter.class).to(newRevisionFormatter.class);
    }
}
