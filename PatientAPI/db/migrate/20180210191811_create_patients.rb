class CreatePatients < ActiveRecord::Migration
  def change
    create_table :patients do |t|
      t.integer :pid
      t.string :name
      t.string :phone
      t.integer :weeks
      t.integer :age
      t.integer :weight
      t.string :address
      t.string :aadhar

      t.timestamps null: false
    end
  end
end
