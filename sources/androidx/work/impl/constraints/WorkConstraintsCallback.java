package androidx.work.impl.constraints;

import java.util.List;

/* loaded from: classes7.dex */
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(List<String> workSpecIds);

    void onAllConstraintsNotMet(List<String> workSpecIds);
}
