package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* loaded from: classes4.dex */
public interface Check {

    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static String invoke(Check check, FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            if (!check.check(functionDescriptor)) {
                return check.getDescription();
            }
            return null;
        }
    }

    boolean check(FunctionDescriptor functionDescriptor);

    String getDescription();

    String invoke(FunctionDescriptor functionDescriptor);
}
