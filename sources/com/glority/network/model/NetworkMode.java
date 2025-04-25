package com.glority.network.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkMode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/glority/network/model/NetworkMode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "DEGENERATED", "MAINTAIN", "NO_INTERNET", "Companion", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class NetworkMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkMode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final NetworkMode NORMAL = new NetworkMode("NORMAL", 0, 0);
    public static final NetworkMode DEGENERATED = new NetworkMode("DEGENERATED", 1, 1);
    public static final NetworkMode MAINTAIN = new NetworkMode("MAINTAIN", 2, 2);
    public static final NetworkMode NO_INTERNET = new NetworkMode("NO_INTERNET", 3, 3);

    private static final /* synthetic */ NetworkMode[] $values() {
        return new NetworkMode[]{NORMAL, DEGENERATED, MAINTAIN, NO_INTERNET};
    }

    public static EnumEntries<NetworkMode> getEntries() {
        return $ENTRIES;
    }

    public static NetworkMode valueOf(String str) {
        return (NetworkMode) Enum.valueOf(NetworkMode.class, str);
    }

    public static NetworkMode[] values() {
        return (NetworkMode[]) $VALUES.clone();
    }

    private NetworkMode(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        NetworkMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: NetworkMode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/network/model/NetworkMode$Companion;", "", "()V", "fromValue", "Lcom/glority/network/model/NetworkMode;", "value", "", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NetworkMode fromValue(int value) {
            for (NetworkMode networkMode : NetworkMode.values()) {
                if (networkMode.getValue() == value) {
                    return networkMode;
                }
            }
            return null;
        }
    }
}
