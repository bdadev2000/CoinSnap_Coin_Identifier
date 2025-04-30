package i5;

import com.google.protobuf.V2;

/* renamed from: i5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2355j implements V2 {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public final int b;

    EnumC2355j(int i9) {
        this.b = i9;
    }

    public static EnumC2355j a(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        return null;
                    }
                    return FOREGROUND_BACKGROUND;
                }
                return BACKGROUND;
            }
            return FOREGROUND;
        }
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.b;
    }
}
