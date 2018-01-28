package MavenApplication.FirstMavenApplication.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> GetTopics()
	{
		return Arrays.asList(new Topic ("1","Topic 1"),
				new Topic ("2","Topic 2"),
				new Topic ("3","Topic 3"));
		
	}
}
