package org.koin.android.logger;

import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.LoggerKt;
import p0.a;

/* loaded from: classes2.dex */
public final class AndroidLogger extends Logger {

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Level.values().length];
            try {
                iArr[Level.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Level.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Level.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Level.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // org.koin.core.logger.Logger
    public void display(@NotNull Level level, @NotNull String str) {
        a.s(level, "level");
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        int i2 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i2 == 1) {
            Log.d(LoggerKt.KOIN_TAG, str);
            return;
        }
        if (i2 == 2) {
            Log.i(LoggerKt.KOIN_TAG, str);
            return;
        }
        if (i2 == 3) {
            Log.w(LoggerKt.KOIN_TAG, str);
        } else if (i2 != 4) {
            Log.e(LoggerKt.KOIN_TAG, str);
        } else {
            Log.e(LoggerKt.KOIN_TAG, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLogger(@NotNull Level level) {
        super(level);
        a.s(level, "level");
    }

    public /* synthetic */ AndroidLogger(Level level, int i2, k kVar) {
        this((i2 & 1) != 0 ? Level.INFO : level);
    }
}
