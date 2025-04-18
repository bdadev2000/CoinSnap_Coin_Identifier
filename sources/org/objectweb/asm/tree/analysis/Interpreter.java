package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.analysis.Value;

/* loaded from: classes4.dex */
public abstract class Interpreter<V extends Value> {
    protected final int api;

    public Interpreter(int i2) {
        this.api = i2;
    }

    public abstract V binaryOperation(AbstractInsnNode abstractInsnNode, V v2, V v3) throws AnalyzerException;

    public abstract V copyOperation(AbstractInsnNode abstractInsnNode, V v2) throws AnalyzerException;

    public abstract V merge(V v2, V v3);

    public abstract V naryOperation(AbstractInsnNode abstractInsnNode, List<? extends V> list) throws AnalyzerException;

    public V newEmptyValue(int i2) {
        return newValue(null);
    }

    public V newExceptionValue(TryCatchBlockNode tryCatchBlockNode, Frame<V> frame, Type type) {
        return newValue(type);
    }

    public abstract V newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException;

    public V newParameterValue(boolean z2, int i2, Type type) {
        return newValue(type);
    }

    public V newReturnTypeValue(Type type) {
        return newValue(type);
    }

    public abstract V newValue(Type type);

    public abstract void returnOperation(AbstractInsnNode abstractInsnNode, V v2, V v3) throws AnalyzerException;

    public abstract V ternaryOperation(AbstractInsnNode abstractInsnNode, V v2, V v3, V v4) throws AnalyzerException;

    public abstract V unaryOperation(AbstractInsnNode abstractInsnNode, V v2) throws AnalyzerException;
}
