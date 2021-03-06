/*
 * Copyright (c) 2019-2029, xkcoding & Yangkai.Shen & 沈扬凯 (237497819@qq.com & xkcoding.com).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xkcoding.magic.core.tool.api;

import com.xkcoding.magic.core.tool.enums.SortType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 通用分页参数封装
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/9/19 22:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "分页参数")
public class PageQuery {
	/**
	 * 当前页码
	 */
	@ApiModelProperty(value = "当前页码", required = true)
	private Integer currentPage;
	/**
	 * 每页条数
	 */
	@ApiModelProperty(value = "每页条数", required = true)
	private Integer pageSize;
	/**
	 * 排序字段
	 */
	@ApiModelProperty(value = "排序字段")
	private String sortBy;
	/**
	 * 排序方式
	 *
	 * @see SortType
	 */
	@ApiModelProperty(value = "排序方式")
	private SortType sortType;
}
