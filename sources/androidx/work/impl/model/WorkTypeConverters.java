package androidx.work.impl.model;

import android.os.Build;
import android.support.v4.media.d;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;

/* loaded from: classes.dex */
public class WorkTypeConverters {

    /* renamed from: androidx.work.impl.model.WorkTypeConverters$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22175a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22176b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f22177c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[OutOfQuotaPolicy.values().length];
            d = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[NetworkType.values().length];
            f22177c = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22177c[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22177c[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22177c[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22177c[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[BackoffPolicy.values().length];
            f22176b = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22176b[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[WorkInfo.State.values().length];
            f22175a = iArr4;
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22175a[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22175a[2] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22175a[3] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22175a[4] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22175a[5] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface BackoffPolicyIds {
    }

    /* loaded from: classes.dex */
    public interface NetworkTypeIds {
    }

    /* loaded from: classes.dex */
    public interface OutOfPolicyIds {
    }

    /* loaded from: classes.dex */
    public interface StateIds {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.ContentUriTriggers a(byte[] r7) {
        /*
            androidx.work.ContentUriTriggers r0 = new androidx.work.ContentUriTriggers
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            androidx.work.ContentUriTriggers$Trigger r5 = new androidx.work.ContentUriTriggers$Trigger     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f21862a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L60
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L5f
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L5f
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L60
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r7 = move-exception
            r7.printStackTrace()
        L5c:
            r1.close()     // Catch: java.io.IOException -> L42
        L5f:
            return r0
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkTypeConverters.a(byte[]):androidx.work.ContentUriTriggers");
    }

    public static BackoffPolicy b(int i2) {
        if (i2 == 0) {
            return BackoffPolicy.f21842a;
        }
        if (i2 == 1) {
            return BackoffPolicy.f21843b;
        }
        throw new IllegalArgumentException(d.j("Could not convert ", i2, " to BackoffPolicy"));
    }

    public static NetworkType c(int i2) {
        if (i2 == 0) {
            return NetworkType.f21881a;
        }
        if (i2 == 1) {
            return NetworkType.f21882b;
        }
        if (i2 == 2) {
            return NetworkType.f21883c;
        }
        if (i2 == 3) {
            return NetworkType.d;
        }
        if (i2 == 4) {
            return NetworkType.f21884f;
        }
        if (Build.VERSION.SDK_INT < 30 || i2 != 5) {
            throw new IllegalArgumentException(d.j("Could not convert ", i2, " to NetworkType"));
        }
        return NetworkType.f21885g;
    }

    public static OutOfQuotaPolicy d(int i2) {
        if (i2 == 0) {
            return OutOfQuotaPolicy.f21890a;
        }
        if (i2 == 1) {
            return OutOfQuotaPolicy.f21891b;
        }
        throw new IllegalArgumentException(d.j("Could not convert ", i2, " to OutOfQuotaPolicy"));
    }

    public static WorkInfo.State e(int i2) {
        if (i2 == 0) {
            return WorkInfo.State.f21897a;
        }
        if (i2 == 1) {
            return WorkInfo.State.f21898b;
        }
        if (i2 == 2) {
            return WorkInfo.State.f21899c;
        }
        if (i2 == 3) {
            return WorkInfo.State.d;
        }
        if (i2 == 4) {
            return WorkInfo.State.f21900f;
        }
        if (i2 == 5) {
            return WorkInfo.State.f21901g;
        }
        throw new IllegalArgumentException(d.j("Could not convert ", i2, " to State"));
    }

    public static int f(WorkInfo.State state) {
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                i2 = 3;
                if (ordinal != 3) {
                    i2 = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + state + " to int");
                    }
                }
            }
        }
        return i2;
    }
}
