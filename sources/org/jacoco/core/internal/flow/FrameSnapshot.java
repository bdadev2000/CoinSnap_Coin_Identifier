package org.jacoco.core.internal.flow;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.commons.AnalyzerAdapter;

/* loaded from: classes4.dex */
class FrameSnapshot implements IFrame {
    private static final FrameSnapshot NOP = new FrameSnapshot(null, null);
    private final Object[] locals;
    private final Object[] stack;

    private FrameSnapshot(Object[] objArr, Object[] objArr2) {
        this.locals = objArr;
        this.stack = objArr2;
    }

    public static IFrame create(AnalyzerAdapter analyzerAdapter, int i2) {
        List<Object> list;
        return (analyzerAdapter == null || (list = analyzerAdapter.locals) == null) ? NOP : new FrameSnapshot(reduce(list, 0), reduce(analyzerAdapter.stack, i2));
    }

    private static Object[] reduce(List<Object> list, int i2) {
        ArrayList arrayList = new ArrayList(list);
        int size = list.size() - i2;
        arrayList.subList(size, list.size()).clear();
        while (true) {
            int i3 = size - 1;
            if (i3 < 0) {
                return arrayList.toArray();
            }
            Object obj = list.get(i3);
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                arrayList.remove(size);
            }
            size = i3;
        }
    }

    @Override // org.jacoco.core.internal.flow.IFrame
    public void accept(MethodVisitor methodVisitor) {
        Object[] objArr = this.locals;
        if (objArr != null) {
            int length = objArr.length;
            Object[] objArr2 = this.stack;
            methodVisitor.visitFrame(-1, length, objArr, objArr2.length, objArr2);
        }
    }
}
