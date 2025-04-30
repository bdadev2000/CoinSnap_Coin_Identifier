package s2;

import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22973a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TrackingFailureReason.values().length];
        b = iArr;
        try {
            iArr[TrackingFailureReason.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[TrackingFailureReason.BAD_STATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[TrackingFailureReason.INSUFFICIENT_LIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[TrackingFailureReason.EXCESSIVE_MOTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[TrackingFailureReason.INSUFFICIENT_FEATURES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[TrackingFailureReason.CAMERA_UNAVAILABLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[TrackingState.values().length];
        f22973a = iArr2;
        try {
            iArr2[TrackingState.PAUSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f22973a[TrackingState.STOPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f22973a[TrackingState.TRACKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
