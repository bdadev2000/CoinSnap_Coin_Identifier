package h;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18640c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18641d;

    public /* synthetic */ o0(int i10, Object obj, Object obj2) {
        this.f18639b = i10;
        this.f18640c = obj;
        this.f18641d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03dd A[Catch: all -> 0x043f, TryCatch #7 {all -> 0x043f, blocks: (B:154:0x038b, B:157:0x0391, B:164:0x03a7, B:166:0x03af, B:168:0x03d7, B:170:0x03dd, B:171:0x03df, B:174:0x03ee, B:177:0x03fb, B:180:0x0408, B:182:0x0415, B:185:0x0427, B:186:0x0429, B:189:0x0421, B:190:0x0406, B:191:0x03f9, B:192:0x03ec, B:193:0x03bb, B:195:0x03c0), top: B:153:0x038b }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0415 A[Catch: all -> 0x043f, TryCatch #7 {all -> 0x043f, blocks: (B:154:0x038b, B:157:0x0391, B:164:0x03a7, B:166:0x03af, B:168:0x03d7, B:170:0x03dd, B:171:0x03df, B:174:0x03ee, B:177:0x03fb, B:180:0x0408, B:182:0x0415, B:185:0x0427, B:186:0x0429, B:189:0x0421, B:190:0x0406, B:191:0x03f9, B:192:0x03ec, B:193:0x03bb, B:195:0x03c0), top: B:153:0x038b }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0427 A[Catch: all -> 0x043f, TryCatch #7 {all -> 0x043f, blocks: (B:154:0x038b, B:157:0x0391, B:164:0x03a7, B:166:0x03af, B:168:0x03d7, B:170:0x03dd, B:171:0x03df, B:174:0x03ee, B:177:0x03fb, B:180:0x0408, B:182:0x0415, B:185:0x0427, B:186:0x0429, B:189:0x0421, B:190:0x0406, B:191:0x03f9, B:192:0x03ec, B:193:0x03bb, B:195:0x03c0), top: B:153:0x038b }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0421 A[Catch: all -> 0x043f, TryCatch #7 {all -> 0x043f, blocks: (B:154:0x038b, B:157:0x0391, B:164:0x03a7, B:166:0x03af, B:168:0x03d7, B:170:0x03dd, B:171:0x03df, B:174:0x03ee, B:177:0x03fb, B:180:0x0408, B:182:0x0415, B:185:0x0427, B:186:0x0429, B:189:0x0421, B:190:0x0406, B:191:0x03f9, B:192:0x03ec, B:193:0x03bb, B:195:0x03c0), top: B:153:0x038b }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0406 A[Catch: all -> 0x043f, TryCatch #7 {all -> 0x043f, blocks: (B:154:0x038b, B:157:0x0391, B:164:0x03a7, B:166:0x03af, B:168:0x03d7, B:170:0x03dd, B:171:0x03df, B:174:0x03ee, B:177:0x03fb, B:180:0x0408, B:182:0x0415, B:185:0x0427, B:186:0x0429, B:189:0x0421, B:190:0x0406, B:191:0x03f9, B:192:0x03ec, B:193:0x03bb, B:195:0x03c0), top: B:153:0x038b }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f9 A[Catch: all -> 0x043f, TryCatch #7 {all -> 0x043f, blocks: (B:154:0x038b, B:157:0x0391, B:164:0x03a7, B:166:0x03af, B:168:0x03d7, B:170:0x03dd, B:171:0x03df, B:174:0x03ee, B:177:0x03fb, B:180:0x0408, B:182:0x0415, B:185:0x0427, B:186:0x0429, B:189:0x0421, B:190:0x0406, B:191:0x03f9, B:192:0x03ec, B:193:0x03bb, B:195:0x03c0), top: B:153:0x038b }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ec A[Catch: all -> 0x043f, TryCatch #7 {all -> 0x043f, blocks: (B:154:0x038b, B:157:0x0391, B:164:0x03a7, B:166:0x03af, B:168:0x03d7, B:170:0x03dd, B:171:0x03df, B:174:0x03ee, B:177:0x03fb, B:180:0x0408, B:182:0x0415, B:185:0x0427, B:186:0x0429, B:189:0x0421, B:190:0x0406, B:191:0x03f9, B:192:0x03ec, B:193:0x03bb, B:195:0x03c0), top: B:153:0x038b }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o0.run():void");
    }

    public /* synthetic */ o0(p0 p0Var, Runnable runnable) {
        this.f18639b = 7;
        this.f18641d = runnable;
        this.f18640c = p0Var;
    }
}
