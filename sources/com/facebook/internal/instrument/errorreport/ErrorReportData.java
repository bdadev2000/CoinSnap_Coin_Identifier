package com.facebook.internal.instrument.errorreport;

import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p0.a;

@RestrictTo
/* loaded from: classes3.dex */
public final class ErrorReportData {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String PARAM_TIMESTAMP = "timestamp";

    @NotNull
    private static final String PRARAM_ERROR_MESSAGE = "error_message";

    @Nullable
    private String errorMessage;

    @NotNull
    private String filename;

    @Nullable
    private Long timestamp;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public ErrorReportData(@Nullable String str) {
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        this.errorMessage = str;
        StringBuffer stringBuffer = new StringBuffer(InstrumentUtility.ERROR_REPORT_PREFIX);
        Long l2 = this.timestamp;
        if (l2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l2.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        a.r(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.filename = stringBuffer2;
    }

    public final void clear() {
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(@NotNull ErrorReportData errorReportData) {
        a.s(errorReportData, "data");
        Long l2 = this.timestamp;
        if (l2 == null) {
            return -1;
        }
        long longValue = l2.longValue();
        Long l3 = errorReportData.timestamp;
        if (l3 == null) {
            return 1;
        }
        return a.F(l3.longValue(), longValue);
    }

    @Nullable
    public final JSONObject getParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l2 = this.timestamp;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            jSONObject.put("error_message", this.errorMessage);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean isValid() {
        return (this.errorMessage == null || this.timestamp == null) ? false : true;
    }

    public final void save() {
        if (isValid()) {
            InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
            InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    @NotNull
    public String toString() {
        JSONObject parameters = getParameters();
        if (parameters == null) {
            return super.toString();
        }
        String jSONObject = parameters.toString();
        a.r(jSONObject, "params.toString()");
        return jSONObject;
    }

    public ErrorReportData(@NotNull File file) {
        a.s(file, ShareInternalUtility.STAGING_PARAM);
        String name = file.getName();
        a.r(name, "file.name");
        this.filename = name;
        JSONObject readFile = InstrumentUtility.readFile(name, true);
        if (readFile != null) {
            this.timestamp = Long.valueOf(readFile.optLong("timestamp", 0L));
            this.errorMessage = readFile.optString("error_message", null);
        }
    }
}
