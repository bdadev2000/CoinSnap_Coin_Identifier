package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;

    public static final Companion Companion = new Companion(null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Modality convertFromFlags(boolean z10, boolean z11, boolean z12) {
            if (z10) {
                return Modality.SEALED;
            }
            if (z11) {
                return Modality.ABSTRACT;
            }
            if (z12) {
                return Modality.OPEN;
            }
            return Modality.FINAL;
        }
    }
}
