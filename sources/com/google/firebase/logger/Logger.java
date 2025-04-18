package com.google.firebase.logger;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.platform.j;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import z0.m;

/* loaded from: classes2.dex */
public abstract class Logger {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;

    @NotNull
    private Level minLevel;

    @NotNull
    private final String tag;

    /* loaded from: classes2.dex */
    public static final class AndroidLogger extends Logger {

        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(@NotNull String str, boolean z2, @NotNull Level level) {
            super(str, z2, level, null);
            a.s(str, "tag");
            a.s(level, "minLevel");
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th) {
            a.s(level, "level");
            a.s(str, "format");
            a.s(objArr, "args");
            if (objArr.length != 0) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str = androidx.compose.foundation.text.input.a.o(copyOf, copyOf.length, str, "format(format, *args)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i2 == 1) {
                String tag = getTag();
                return th != null ? Log.v(tag, str, th) : Log.v(tag, str);
            }
            if (i2 == 2) {
                String tag2 = getTag();
                return th != null ? Log.d(tag2, str, th) : Log.d(tag2, str);
            }
            if (i2 == 3) {
                String tag3 = getTag();
                return th != null ? Log.i(tag3, str, th) : Log.i(tag3, str);
            }
            if (i2 == 4) {
                String tag4 = getTag();
                return th != null ? Log.w(tag4, str, th) : Log.w(tag4, str);
            }
            if (i2 != 5) {
                throw new RuntimeException();
            }
            String tag5 = getTag();
            return th != null ? Log.e(tag5, str, th) : Log.e(tag5, str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z2, Level level, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            if ((i2 & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z2, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z2, Level level, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            if ((i2 & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z2, level);
        }

        @NotNull
        public final Logger getLogger(@NotNull String str, boolean z2, @NotNull Level level) {
            Object putIfAbsent;
            a.s(str, "tag");
            a.s(level, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new AndroidLogger(str, z2, level)))) != null) {
                obj = putIfAbsent;
            }
            return (Logger) obj;
        }

        @VisibleForTesting
        @NotNull
        public final FakeLogger setupFakeLogger(@NotNull String str, boolean z2, @NotNull Level level) {
            a.s(str, "tag");
            a.s(level, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(str, z2, level);
            Logger.loggers.put(str, fakeLogger);
            return fakeLogger;
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static final class FakeLogger extends Logger {

        @NotNull
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(@NotNull String str, boolean z2, @NotNull Level level) {
            super(str, z2, level, null);
            a.s(str, "tag");
            a.s(level, "minLevel");
            this.record = new ArrayList();
        }

        private final String toLogMessage(Level level, String str, Object[] objArr, Throwable th) {
            if (objArr.length != 0) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str = androidx.compose.foundation.text.input.a.o(copyOf, copyOf.length, str, "format(format, *args)");
            }
            if (th != null) {
                String str2 = level + ' ' + str + ' ' + Log.getStackTraceString(th);
                if (str2 != null) {
                    return str2;
                }
            }
            return level + ' ' + str;
        }

        @VisibleForTesting
        public final void clearLogMessages() {
            this.record.clear();
        }

        @VisibleForTesting
        public final boolean hasLogMessage(@NotNull String str) {
            a.s(str, "message");
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (m.M0((String) it.next(), str, false)) {
                    return true;
                }
            }
            return false;
        }

        @VisibleForTesting
        public final boolean hasLogMessageThat(@NotNull l lVar) {
            a.s(lVar, "predicate");
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) lVar.invoke(it.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th) {
            a.s(level, "level");
            a.s(str, "format");
            a.s(objArr, "args");
            String logMessage = toLogMessage(level, str, objArr, th);
            System.out.println((Object) j.b("Log: ", logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    /* loaded from: classes2.dex */
    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Level(int i2) {
            this.priority = i2;
        }

        public final int getPriority$com_google_firebase_firebase_common() {
            return this.priority;
        }
    }

    public /* synthetic */ Logger(String str, boolean z2, Level level, k kVar) {
        this(str, z2, level);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    @NotNull
    public static final Logger getLogger(@NotNull String str, boolean z2, @NotNull Level level) {
        return Companion.getLogger(str, z2, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    private final int logIfAble(Level level, String str, Object[] objArr, Throwable th) {
        if (!this.enabled || (this.minLevel.getPriority$com_google_firebase_firebase_common() > level.getPriority$com_google_firebase_firebase_common() && !Log.isLoggable(this.tag, level.getPriority$com_google_firebase_firebase_common()))) {
            return 0;
        }
        return log(level, str, objArr, th);
    }

    public static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i2 & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    @VisibleForTesting
    @NotNull
    public static final FakeLogger setupFakeLogger(@NotNull String str, boolean z2, @NotNull Level level) {
        return Companion.setupFakeLogger(str, z2, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    public final int debug(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return debug$default(this, str, null, 2, null);
    }

    public final int error(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return error$default(this, str, null, 2, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final Level getMinLevel() {
        return this.minLevel;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final int info(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return info$default(this, str, null, 2, null);
    }

    public abstract int log(@NotNull Level level, @NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th);

    public final void setEnabled(boolean z2) {
        this.enabled = z2;
    }

    public final void setMinLevel(@NotNull Level level) {
        a.s(level, "<set-?>");
        this.minLevel = level;
    }

    public final int verbose(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return verbose$default(this, str, null, 2, null);
    }

    public final int warn(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return warn$default(this, str, null, 2, null);
    }

    private Logger(String str, boolean z2, Level level) {
        this.tag = str;
        this.enabled = z2;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    public final int debug(@NotNull String str, @NotNull Object... objArr) {
        a.s(str, "format");
        a.s(objArr, "args");
        return debug$default(this, str, objArr, null, 4, null);
    }

    public final int error(@NotNull String str, @NotNull Object... objArr) {
        a.s(str, "format");
        a.s(objArr, "args");
        return error$default(this, str, objArr, null, 4, null);
    }

    public final int info(@NotNull String str, @NotNull Object... objArr) {
        a.s(str, "format");
        a.s(objArr, "args");
        return info$default(this, str, objArr, null, 4, null);
    }

    public final int verbose(@NotNull String str, @NotNull Object... objArr) {
        a.s(str, "format");
        a.s(objArr, "args");
        return verbose$default(this, str, objArr, null, 4, null);
    }

    public final int warn(@NotNull String str, @NotNull Object... objArr) {
        a.s(str, "format");
        a.s(objArr, "args");
        return warn$default(this, str, objArr, null, 4, null);
    }

    public final int debug(@NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th) {
        a.s(str, "format");
        a.s(objArr, "args");
        return logIfAble(Level.DEBUG, str, objArr, th);
    }

    public final int error(@NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th) {
        a.s(str, "format");
        a.s(objArr, "args");
        return logIfAble(Level.ERROR, str, objArr, th);
    }

    public final int info(@NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th) {
        a.s(str, "format");
        a.s(objArr, "args");
        return logIfAble(Level.INFO, str, objArr, th);
    }

    public final int verbose(@NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th) {
        a.s(str, "format");
        a.s(objArr, "args");
        return logIfAble(Level.VERBOSE, str, objArr, th);
    }

    public final int warn(@NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th) {
        a.s(str, "format");
        a.s(objArr, "args");
        return logIfAble(Level.WARN, str, objArr, th);
    }

    public final int debug(@NotNull String str, @Nullable Throwable th) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return logIfAble$default(this, Level.DEBUG, str, null, th, 4, null);
    }

    public final int error(@NotNull String str, @Nullable Throwable th) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return logIfAble$default(this, Level.ERROR, str, null, th, 4, null);
    }

    public final int info(@NotNull String str, @Nullable Throwable th) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return logIfAble$default(this, Level.INFO, str, null, th, 4, null);
    }

    public final int verbose(@NotNull String str, @Nullable Throwable th) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return logIfAble$default(this, Level.VERBOSE, str, null, th, 4, null);
    }

    public final int warn(@NotNull String str, @Nullable Throwable th) {
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        return logIfAble$default(this, Level.WARN, str, null, th, 4, null);
    }
}
