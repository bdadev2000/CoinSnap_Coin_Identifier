package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SnackbarDuration {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SnackbarDuration[] f11506a = {new Enum("Short", 0), new Enum("Long", 1), new Enum("Indefinite", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    SnackbarDuration EF5;

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) f11506a.clone();
    }
}
