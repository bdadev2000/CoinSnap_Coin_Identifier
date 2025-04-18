package org.jacoco.core.runtime;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class LoggerRuntime extends AbstractRuntime {
    private static final String CHANNEL = "jacoco-runtime";
    private final String key = Integer.toHexString(hashCode());
    private final Logger logger = configureLogger();
    private final Handler handler = new RuntimeHandler();

    /* loaded from: classes3.dex */
    public class RuntimeHandler extends Handler {
        private RuntimeHandler() {
        }

        @Override // java.util.logging.Handler
        public void close() throws SecurityException {
            LoggerRuntime.this.logger.addHandler(LoggerRuntime.this.handler);
        }

        @Override // java.util.logging.Handler
        public void flush() {
        }

        @Override // java.util.logging.Handler
        public void publish(LogRecord logRecord) {
            if (LoggerRuntime.this.key.equals(logRecord.getMessage())) {
                LoggerRuntime.this.data.getProbes(logRecord.getParameters());
            }
        }
    }

    private Logger configureLogger() {
        Logger logger = Logger.getLogger(CHANNEL);
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
        return logger;
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j2, String str, int i2, MethodVisitor methodVisitor) {
        RuntimeData.generateArgumentArray(j2, str, i2, methodVisitor);
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn(CHANNEL);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
        methodVisitor.visitInsn(95);
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
        methodVisitor.visitInsn(95);
        methodVisitor.visitLdcInsn(this.key);
        methodVisitor.visitInsn(95);
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/util/logging/Logger", CreativeInfo.an, "(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V", false);
        methodVisitor.visitInsn(3);
        methodVisitor.visitInsn(50);
        methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, InstrSupport.DATAFIELD_DESC);
        return 5;
    }

    @Override // org.jacoco.core.runtime.IRuntime
    public void shutdown() {
        this.logger.removeHandler(this.handler);
    }

    @Override // org.jacoco.core.runtime.AbstractRuntime, org.jacoco.core.runtime.IRuntime
    public void startup(RuntimeData runtimeData) throws Exception {
        super.startup(runtimeData);
        this.logger.addHandler(this.handler);
    }
}
