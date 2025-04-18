package com.bytedance.sdk.component.Sg.YFl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class eT implements Cloneable {
    public long AlY;
    public TimeUnit DSW;
    public long Sg;
    public List<qsH> YFl;
    public TimeUnit tN;

    /* renamed from: vc, reason: collision with root package name */
    public long f10335vc;
    public TimeUnit wN;

    public eT(YFl yFl) {
        this.Sg = yFl.Sg;
        this.AlY = yFl.AlY;
        this.f10335vc = yFl.f10336vc;
        List<qsH> list = yFl.YFl;
        this.tN = yFl.tN;
        this.wN = yFl.wN;
        this.DSW = yFl.DSW;
        this.YFl = list;
    }

    public YFl Sg() {
        return new YFl(this);
    }

    public abstract AlY YFl();

    public abstract Sg YFl(GA ga2);

    /* loaded from: classes.dex */
    public static final class YFl {
        public long AlY;
        public TimeUnit DSW;
        public long Sg;
        public final List<qsH> YFl;
        public TimeUnit tN;

        /* renamed from: vc, reason: collision with root package name */
        public long f10336vc;
        public TimeUnit wN;

        public YFl() {
            this.YFl = new ArrayList();
            this.Sg = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.tN = timeUnit;
            this.AlY = 10000L;
            this.wN = timeUnit;
            this.f10336vc = 10000L;
            this.DSW = timeUnit;
        }

        public YFl Sg(long j3, TimeUnit timeUnit) {
            this.AlY = j3;
            this.wN = timeUnit;
            return this;
        }

        public YFl YFl(long j3, TimeUnit timeUnit) {
            this.Sg = j3;
            this.tN = timeUnit;
            return this;
        }

        public YFl tN(long j3, TimeUnit timeUnit) {
            this.f10336vc = j3;
            this.DSW = timeUnit;
            return this;
        }

        public YFl YFl(qsH qsh) {
            this.YFl.add(qsh);
            return this;
        }

        public eT YFl() {
            return com.bytedance.sdk.component.Sg.YFl.YFl.YFl.YFl(this);
        }

        public YFl(String str) {
            this.YFl = new ArrayList();
            this.Sg = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.tN = timeUnit;
            this.AlY = 10000L;
            this.wN = timeUnit;
            this.f10336vc = 10000L;
            this.DSW = timeUnit;
        }

        public YFl(eT eTVar) {
            this.YFl = new ArrayList();
            this.Sg = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.tN = timeUnit;
            this.AlY = 10000L;
            this.wN = timeUnit;
            this.f10336vc = 10000L;
            this.DSW = timeUnit;
            this.Sg = eTVar.Sg;
            this.tN = eTVar.tN;
            this.AlY = eTVar.AlY;
            this.wN = eTVar.wN;
            this.f10336vc = eTVar.f10335vc;
            this.DSW = eTVar.DSW;
        }
    }
}
