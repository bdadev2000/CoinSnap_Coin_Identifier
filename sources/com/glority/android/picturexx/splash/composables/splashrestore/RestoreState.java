package com.glority.android.picturexx.splash.composables.splashrestore;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SplashRestoreScreen.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/splash/composables/splashrestore/RestoreState;", "", "index", "", "<init>", "(Ljava/lang/String;II)V", "getIndex", "()I", "LOADING", "DONE", "FAIL", "MANUAL", "Companion", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RestoreState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RestoreState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int index;
    public static final RestoreState LOADING = new RestoreState("LOADING", 0, 0);
    public static final RestoreState DONE = new RestoreState("DONE", 1, 1);
    public static final RestoreState FAIL = new RestoreState("FAIL", 2, 2);
    public static final RestoreState MANUAL = new RestoreState("MANUAL", 3, 3);

    private static final /* synthetic */ RestoreState[] $values() {
        return new RestoreState[]{LOADING, DONE, FAIL, MANUAL};
    }

    public static EnumEntries<RestoreState> getEntries() {
        return $ENTRIES;
    }

    private RestoreState(String str, int i, int i2) {
        this.index = i2;
    }

    public final int getIndex() {
        return this.index;
    }

    static {
        RestoreState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: SplashRestoreScreen.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/splash/composables/splashrestore/RestoreState$Companion;", "", "<init>", "()V", "fromIndex", "Lcom/glority/android/picturexx/splash/composables/splashrestore/RestoreState;", "index", "", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RestoreState fromIndex(int index) {
            RestoreState restoreState;
            RestoreState[] values = RestoreState.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    restoreState = null;
                    break;
                }
                restoreState = values[i];
                if (restoreState.getIndex() == index) {
                    break;
                }
                i++;
            }
            return restoreState == null ? RestoreState.LOADING : restoreState;
        }
    }

    public static RestoreState valueOf(String str) {
        return (RestoreState) Enum.valueOf(RestoreState.class, str);
    }

    public static RestoreState[] values() {
        return (RestoreState[]) $VALUES.clone();
    }
}
