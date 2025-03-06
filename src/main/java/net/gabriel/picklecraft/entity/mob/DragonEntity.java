package net.gabriel.picklecraft.entity.mob;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DragonEntity extends Animal{

	protected DragonEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Override
	public boolean isFood(ItemStack p_27600_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
		// TODO Auto-generated method stub
		return null;
	}

}
