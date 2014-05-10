package com.qubole.qds.sdk.java.details;

import com.google.common.collect.Maps;
import com.qubole.qds.sdk.java.api.AllCommandsReportBuilder;
import com.qubole.qds.sdk.java.client.QdsClient;
import com.qubole.qds.sdk.java.entities.AllCommandsReport;
import java.util.Map;
import java.util.concurrent.Future;

class AllCommandsReportBuilderImpl extends InvocationCallbackBase<AllCommandsReport> implements AllCommandsReportBuilder
{
    private final QdsClient client;
    private final Map<String, String> parameters = Maps.newHashMap();

    @Override
    public AllCommandsReportBuilder start_date(String start_date)
    {
        parameters.put("start_date", start_date);
        return this;
    }

    @Override
    public AllCommandsReportBuilder end_date(String end_date)
    {
        parameters.put("end_date", end_date);
        return this;
    }

    @Override
    public AllCommandsReportBuilder offset(int offset)
    {
        parameters.put("offset", Integer.toString(offset));
        return this;
    }

    @Override
    public AllCommandsReportBuilder limit(int limit)
    {
        parameters.put("limit", Integer.toString(limit));
        return this;
    }

    @Override
    public AllCommandsReportBuilder sort_column(String sort_column)
    {
        parameters.put("sort_column", sort_column);
        return this;
    }

    @Override
    public AllCommandsReportBuilder by_user(String by_user)
    {
        parameters.put("by_user", by_user);
        return this;
    }

    @Override
    public Future<AllCommandsReport> invoke()
    {
        ClientEntity entity = new ClientEntity(null, ClientEntity.Method.GET, parameters);
        return invokeRequest(client, null, entity, AllCommandsReport.class, "reports", "all_commands");
    }

    AllCommandsReportBuilderImpl(QdsClient client)
    {
        this.client = client;
    }
}