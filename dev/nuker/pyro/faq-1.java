/**
 * Obfuscator: Binsecure  Decompiler: FernFlower
 * De-obfuscated by Gopro336
 */
package dev.nuker.pyro;

import java.util.List;

public class faq extends far {
   // $FF: renamed from: c double
   public double field_1177;
   // $FF: renamed from: 0 double
   public double field_1178;
   // $FF: renamed from: c int
   public int field_1179 = 0;
   // $FF: renamed from: 0 int
   public int field_1180 = 2;

   // $FF: renamed from: c (dev.nuker.pyro.f4p) void
   public void method_1681(f4p var1) {
      if (!var1.c() && var1.c() == f41.field_2120) {
         if (fec.method_1756().collidedHorizontally || fec.method_1756().moveForward == 0.0F && fec.method_1756().moveStrafing == 0.0F) {
            this.field_1179 = 0;
            this.field_1180 = 2;
            var1.0();
            var1.method_3125(0.0D);
            var1.method_3127(0.0D);
            f0b.field_2415.method_3669("longjump");
         } else {
            if ((Boolean)PyroStatic.field_2519.method_486().c()) {
               f0b.field_2415.method_3667("longjump", f07.field_2303, 2.5F);
            }

            if (this.field_1180 <= 0 || fec.method_1756().moveForward == 0.0F && fec.method_1756().moveStrafing == 0.0F) {
               if (this.field_1179 != 1 || !fec.method_1756().collidedVertically || fec.method_1756().moveForward == 0.0F && fec.method_1756().moveStrafing == 0.0F) {
                  if (this.field_1179 != 2 || !fec.method_1756().collidedVertically || fec.method_1756().moveForward == 0.0F && fec.method_1756().moveStrafing == 0.0F) {
                     if (this.field_1179 == 3) {
                        double var2 = 0.66D * (this.field_1178 - far.method_1680());
                        this.field_1177 = this.field_1178 - var2;
                     } else {
                        this.field_1177 = this.field_1178 - this.field_1178 / 159.0D;
                     }
                  } else {
                     var1.method_3120(fec.method_1756().motionY = 0.415D);
                     this.field_1177 *= (Double)PyroStatic.field_2519.method_490().c();
                  }
               } else {
                  this.field_1177 = 1.0D + far.method_1680() - 0.05D;
               }
            } else {
               this.field_1177 = 0.09D;
               --this.field_1180;
            }

            var1.0();
            fec.method_1774(var1, this.field_1177);
            List var4 = c.world.getCollisionBoxes(c.player, c.player.getEntityBoundingBox().offset(0.0D, c.player.motionY, 0.0D));
            List var3 = c.world.getCollisionBoxes(c.player, c.player.getEntityBoundingBox().offset(0.0D, -0.4D, 0.0D));
            if (!fec.method_1756().collidedVertically && (var4.size() > 0 || var3.size() > 0) && this.field_1179 > 10) {
               if (this.field_1179 >= 38) {
                  var1.method_3120(fec.method_1756().motionY = -0.4D);
                  this.field_1179 = 0;
                  this.field_1180 = 5;
               } else {
                  var1.method_3120(fec.method_1756().motionY = -0.001D);
               }
            }

            if (this.field_1180 <= 0 && (fec.method_1756().moveForward != 0.0F || fec.method_1756().moveStrafing != 0.0F)) {
               ++this.field_1179;
            }

         }
      }
   }

   public void meth0() {
   }

   // $FF: renamed from: c (dev.nuker.pyro.f4u) void
   public void method_1684(f4u var1) {
      if (var1.c() == f41.field_2120) {
         double var2 = c.player.posX - c.player.prevPosX;
         double var4 = c.player.posZ - c.player.prevPosZ;
         this.field_1178 = Math.sqrt(var2 * var2 + var4 * var4);
      }
   }

   // $FF: renamed from: c () void
   public void method_1682() {
   }
}
