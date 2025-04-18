package x0;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface b extends a {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    o getReturnType();

    List getTypeParameters();

    p getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
