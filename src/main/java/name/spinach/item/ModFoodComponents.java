package name.spinach.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SPINACH = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,200),0.2f).build();

}
