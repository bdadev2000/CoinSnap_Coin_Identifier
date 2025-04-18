package androidx.work;

import android.net.Network;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public UUID f21912a;

    /* renamed from: b, reason: collision with root package name */
    public Data f21913b;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f21914c;
    public RuntimeExtras d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f21915f;

    /* renamed from: g, reason: collision with root package name */
    public TaskExecutor f21916g;

    /* renamed from: h, reason: collision with root package name */
    public WorkerFactory f21917h;

    /* renamed from: i, reason: collision with root package name */
    public ProgressUpdater f21918i;

    /* renamed from: j, reason: collision with root package name */
    public ForegroundUpdater f21919j;

    @RestrictTo
    /* loaded from: classes.dex */
    public static class RuntimeExtras {

        /* renamed from: a, reason: collision with root package name */
        public List f21920a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        public List f21921b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        public Network f21922c;
    }
}
