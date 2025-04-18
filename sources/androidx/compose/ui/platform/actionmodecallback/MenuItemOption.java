package androidx.compose.ui.platform.actionmodecallback;

/* loaded from: classes2.dex */
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f16709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16710b;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    MenuItemOption(int i2) {
        this.f16709a = i2;
        this.f16710b = i2;
    }
}
