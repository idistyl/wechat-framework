package com.itfvck.wechatframework.api.core.req.model.dataCube;

import com.itfvck.wechatframework.core.common.BaseData;

/**
 * @ClassName: WxDataCubeStreamUserReadParam
 * @Description: 获取图文统计数据，最大时间跨度 3
 * @author zhaoxl
 * @date 2015年1月29日 下午10:40:07
 */
public class DataCubeStreamUserReadParam extends BaseData {

	private static final long serialVersionUID = -7455285381853542851L;
	/**
	 * 获取数据的起始日期<br/>
	 * begin_date和end_date的差值需小于“最大时间跨度”<br/>
	 * （比如最大时间跨度为1时，begin_date和end_date的差值只能为0，才能小于1），<br/>
	 * 否则会报错
	 */
	private String begin_date;
	/**
	 * 获取数据的结束日期<br/>
	 * end_date允许设置的最大值为昨日
	 */
	private String end_date;

	public String getBegin_date() {
		return begin_date;
	}

	public void setBegin_date(String begin_date) {
		this.begin_date = begin_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

}
