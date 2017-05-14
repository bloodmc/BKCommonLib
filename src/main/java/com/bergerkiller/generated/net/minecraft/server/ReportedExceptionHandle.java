package com.bergerkiller.generated.net.minecraft.server;

import com.bergerkiller.mountiplex.reflection.declarations.Template;
import com.bergerkiller.mountiplex.reflection.util.StaticInitHelper;
import com.bergerkiller.generated.net.minecraft.server.ReportedExceptionHandle;
import com.bergerkiller.generated.net.minecraft.server.CrashReportHandle;

public class ReportedExceptionHandle extends Template.Handle {
    public static final ReportedExceptionClass T = new ReportedExceptionClass();
    static final StaticInitHelper _init_helper = new StaticInitHelper(ReportedExceptionHandle.class, "net.minecraft.server.ReportedException");


    /* ============================================================================== */

    public static final ReportedExceptionHandle createHandle(Object handleInstance) {
        if (handleInstance == null) throw new IllegalArgumentException("Handle instance can not be null");
        ReportedExceptionHandle handle = new ReportedExceptionHandle();
        handle.instance = handleInstance;
        return handle;
    }

    public static final ReportedExceptionHandle createNew(CrashReportHandle paramCrashReport) {
        return T.constr_paramCrashReport.newInstance(paramCrashReport);
    }

    /* ============================================================================== */

    public static final class ReportedExceptionClass extends Template.Class {
        public final Template.Constructor.Converted<ReportedExceptionHandle> constr_paramCrashReport = new Template.Constructor.Converted<ReportedExceptionHandle>();

    }
}
