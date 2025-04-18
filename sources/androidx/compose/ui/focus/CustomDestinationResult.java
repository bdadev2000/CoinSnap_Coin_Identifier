package androidx.compose.ui.focus;

import com.facebook.internal.AnalyticsEvents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CustomDestinationResult {

    /* renamed from: a, reason: collision with root package name */
    public static final CustomDestinationResult f14826a;

    /* renamed from: b, reason: collision with root package name */
    public static final CustomDestinationResult f14827b;

    /* renamed from: c, reason: collision with root package name */
    public static final CustomDestinationResult f14828c;
    public static final CustomDestinationResult d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CustomDestinationResult[] f14829f;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.focus.CustomDestinationResult, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.focus.CustomDestinationResult, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.focus.CustomDestinationResult, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.focus.CustomDestinationResult, java.lang.Enum] */
    static {
        ?? r02 = new Enum("None", 0);
        f14826a = r02;
        ?? r1 = new Enum(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED, 1);
        f14827b = r1;
        ?? r2 = new Enum("Redirected", 2);
        f14828c = r2;
        ?? r3 = new Enum("RedirectCancelled", 3);
        d = r3;
        f14829f = new CustomDestinationResult[]{r02, r1, r2, r3};
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) f14829f.clone();
    }
}
