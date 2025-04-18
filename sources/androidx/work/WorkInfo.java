package androidx.work;

import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class WorkInfo {

    /* renamed from: a, reason: collision with root package name */
    public UUID f21893a;

    /* renamed from: b, reason: collision with root package name */
    public State f21894b;

    /* renamed from: c, reason: collision with root package name */
    public Data f21895c;
    public HashSet d;
    public Data e;

    /* renamed from: f, reason: collision with root package name */
    public int f21896f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f21897a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f21898b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f21899c;
        public static final State d;

        /* renamed from: f, reason: collision with root package name */
        public static final State f21900f;

        /* renamed from: g, reason: collision with root package name */
        public static final State f21901g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ State[] f21902h;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.work.WorkInfo$State] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.work.WorkInfo$State] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.work.WorkInfo$State] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.work.WorkInfo$State] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.work.WorkInfo$State] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.work.WorkInfo$State] */
        static {
            ?? r02 = new Enum("ENQUEUED", 0);
            f21897a = r02;
            ?? r1 = new Enum("RUNNING", 1);
            f21898b = r1;
            ?? r2 = new Enum("SUCCEEDED", 2);
            f21899c = r2;
            ?? r3 = new Enum("FAILED", 3);
            d = r3;
            ?? r4 = new Enum("BLOCKED", 4);
            f21900f = r4;
            ?? r5 = new Enum("CANCELLED", 5);
            f21901g = r5;
            f21902h = new State[]{r02, r1, r2, r3, r4, r5};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f21902h.clone();
        }

        public final boolean a() {
            return this == f21899c || this == d || this == f21901g;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f21896f == workInfo.f21896f && this.f21893a.equals(workInfo.f21893a) && this.f21894b == workInfo.f21894b && this.f21895c.equals(workInfo.f21895c) && this.d.equals(workInfo.d)) {
            return this.e.equals(workInfo.e);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.e.hashCode() + ((this.d.hashCode() + ((this.f21895c.hashCode() + ((this.f21894b.hashCode() + (this.f21893a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f21896f;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f21893a + "', mState=" + this.f21894b + ", mOutputData=" + this.f21895c + ", mTags=" + this.d + ", mProgress=" + this.e + '}';
    }
}
