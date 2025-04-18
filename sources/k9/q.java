package k9;

import java.util.List;
import s7.r0;
import v8.i1;

/* loaded from: classes3.dex */
public interface q {
    boolean a(int i10, long j3);

    int b(r0 r0Var);

    boolean c(int i10, long j3);

    default void d() {
    }

    void disable();

    default void e(boolean z10) {
    }

    void enable();

    int evaluateQueueSize(long j3, List list);

    void f(long j3, long j10, long j11, List list, x8.m[] mVarArr);

    default boolean g(long j3, x8.e eVar, List list) {
        return false;
    }

    r0 getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    r0 getSelectedFormat();

    int getSelectedIndex();

    Object getSelectionData();

    int getSelectionReason();

    i1 getTrackGroup();

    default void h() {
    }

    int indexOf(int i10);

    int length();

    void onPlaybackSpeed(float f10);
}
