package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.input.a;
import com.applovin.impl.adview.t;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {
    private final String file;
    private final int importance;
    private final long offset;
    private final long pc;
    private final String symbol;

    /* loaded from: classes.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {
        private String file;
        private int importance;
        private long offset;
        private long pc;
        private byte set$0;
        private String symbol;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String str;
            if (this.set$0 == 7 && (str = this.symbol) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(this.pc, str, this.file, this.offset, this.importance);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" pc");
            }
            if (this.symbol == null) {
                sb.append(" symbol");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(t.m("Missing required properties:", sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.file = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i2) {
            this.importance = i2;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j2) {
            this.offset = j2;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j2) {
            this.pc = j2;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.symbol = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        return this.pc == frame.getPc() && this.symbol.equals(frame.getSymbol()) && ((str = this.file) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.offset == frame.getOffset() && this.importance == frame.getImportance();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @Nullable
    public String getFile() {
        return this.file;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getOffset() {
        return this.offset;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getPc() {
        return this.pc;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @NonNull
    public String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        long j2 = this.pc;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.symbol.hashCode()) * 1000003;
        String str = this.file;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.offset;
        return ((hashCode2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.importance;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.pc);
        sb.append(", symbol=");
        sb.append(this.symbol);
        sb.append(", file=");
        sb.append(this.file);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", importance=");
        return a.n(sb, this.importance, "}");
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long j2, String str, @Nullable String str2, long j3, int i2) {
        this.pc = j2;
        this.symbol = str;
        this.file = str2;
        this.offset = j3;
        this.importance = i2;
    }
}
