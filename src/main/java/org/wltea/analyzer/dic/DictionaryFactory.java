//package org.wltea.analyzer.dic;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.wltea.analyzer.cfg.SolrConfiguration;
///**
// * 工厂类根据配置生成Dictionary
// * @author gaoj
// *
// */
//public class DictionaryFactory {
//	static Map<SolrConfiguration ,Dictionary > dictionaryMap=new HashMap<>();
//	/**
//	 * 根据配置在zk上创建一个dic节点
//	 */
//	public void createDicNode(SolrConfiguration cfg) {
//		
//	}
//	public static Dictionary getDictionary(SolrConfiguration cfg) {
//		if(dictionaryMap.containsKey(cfg)) 
//			return dictionaryMap.get(cfg);
//		Dictionary dictionary=new Dictionary(cfg);
//		dictionaryMap.put(cfg, dictionary);
//		return dictionary; 
//	}
//	protected static class DicContext {
//		
//	}
//}
