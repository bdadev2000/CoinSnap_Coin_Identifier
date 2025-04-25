package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;

/* compiled from: javaElements.kt */
/* loaded from: classes9.dex */
public interface JavaMethod extends JavaMember, JavaTypeParameterListOwner {
    JavaAnnotationArgument getAnnotationParameterDefaultValue();

    boolean getHasAnnotationParameterDefaultValue();

    JavaType getReturnType();

    List<JavaValueParameter> getValueParameters();
}
