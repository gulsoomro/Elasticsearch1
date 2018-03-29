package com.test;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.node.NodeBuilder;
//import org.elasticsearch.node.NodeBuilder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Component;

//@Component
//@ComponentScan(basePackages = { "com.test.repository" })
@Configuration
@EnableElasticsearchRepositories(basePackages="com.test.repository")
public class ElasticConfig 
{

	@Value("${spring.data.elasticsearch.cluster-name}")
	String clusterName;

	 @Bean
	public ElasticsearchOperations elasticsearchTemplate() throws Exception {
//		Settings settings = Settings.builder().put("cluster.name", "es5").build();
//		TransportClient client = new PreBuiltTransportClient(settings)
//				.addTransportAddress((TransportAddress) new InetSocketTransportAddress(InetAddress.getByName("0.0.0.0"), 9300));

		Settings settings = Settings.builder()
		        .put("cluster.name", clusterName).build();
		TransportClient client = new PreBuiltTransportClient(settings);
		return new ElasticsearchTemplate(client);
	}
	 
	 
	 
	 

	
}
