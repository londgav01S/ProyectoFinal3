package co.edu.uniquindio.subasta.config;

import com.rabbitmq.client.ConnectionFactory;

public class RabbitFactory {
    private ConnectionFactory connectionFactory;
    public RabbitFactory() {
        this.connectionFactory = new ConnectionFactory();
        this.connectionFactory.setHost("localhost");
        this.connectionFactory.setPort(5672);
        this.connectionFactory.setUsername("londgav");
        this.connectionFactory.setPassword("12345");
    }

    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }
}
