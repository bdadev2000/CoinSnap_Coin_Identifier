package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.applovin.impl.mediation.ads.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes4.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c10) {
        super(Character.valueOf(c10));
    }

    private final String getPrintablePart(char c10) {
        if (c10 == '\b') {
            return "\\b";
        }
        if (c10 == '\t') {
            return "\\t";
        }
        if (c10 == '\n') {
            return "\\n";
        }
        if (c10 == '\f') {
            return "\\f";
        }
        if (c10 == '\r') {
            return "\\r";
        }
        if (isPrintableUnicode(c10)) {
            return String.valueOf(c10);
        }
        return "?";
    }

    private final boolean isPrintableUnicode(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return e.h(new Object[]{Integer.valueOf(getValue().charValue()), getPrintablePart(getValue().charValue())}, 2, "\\u%04X ('%s')", "format(this, *args)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType charType = module.getBuiltIns().getCharType();
        Intrinsics.checkNotNullExpressionValue(charType, "module.builtIns.charType");
        return charType;
    }
}
