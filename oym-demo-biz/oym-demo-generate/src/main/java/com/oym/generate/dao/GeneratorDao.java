package com.oym.generate.dao;

import com.oym.base.db.dao.BaseDao;
import com.oym.base.db.entity.BaseEntity;
import com.oym.generate.base.query.TableQuery;
import com.oym.generate.entity.Column;
import com.oym.generate.entity.Table;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface GeneratorDao extends BaseDao<BaseEntity> {

    List<Table> queryTableList(TableQuery tableQuery);

    List<Column> queryColumns(TableQuery tableQuery);
}
